package study.thread.semaphore;

import java.util.Random;
import java.util.concurrent.Semaphore;

/**
 * Created by sould on 2016-06-30.
 */
public class SemaphoreTest {

    private static final Random rd = new Random(100);

    static class Log{
        public static void debug(String strMessage){
            System.out.println(Thread.currentThread().getName()+ ":" +strMessage);
        }
    }

    class SemaphoreResource extends Semaphore{

        private static final long serialVersionUID = 1L;

        public SemaphoreResource(int permits) {
            super(permits);
        }

        public void use() throws InterruptedException{
            acquire();      // 세마포어 리소스 확보
            try{
                doUse();
            }finally {
                release();  // 세마포어 리소스 해제
                Log.debug("Thread 종료 후 남은 permits : "+this.availablePermits());
            }
        }

        protected void doUse() throws InterruptedException{
            // 임의의 프로그램을 실행하는데 걸리는 가상의 시간
            int sleepTime = rd.nextInt(500);
            Thread.sleep(sleepTime);    // 런타임 시간 설정
            Log.debug("Thread 실행..............."+sleepTime);
            /** something logic**/
        }
    }

    class MyThread extends Thread{
        private final SemaphoreResource resource;
        public MyThread(String threadName, SemaphoreResource resource){
            this.resource = resource;
            this.setName(threadName);
        }

        @Override
        public void run() {
            try{
                resource.use();
            }catch (InterruptedException ie){
                ie.printStackTrace();
            }finally {

            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Test Start! ....");
        SemaphoreResource resource = new SemaphoreTest().new SemaphoreResource(4);
        for(int i=0; i<20; i++){
            new SemaphoreTest().new MyThread("Thread-"+ i, resource).start();
        }
    }
}
