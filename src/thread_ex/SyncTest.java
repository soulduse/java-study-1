package thread_ex;

/**
 * Created by sould on 2015-11-02.
 */
public class SyncTest {
    public static void main(String[] args) {


        startThread();

    }


    public static synchronized void startThread(){
        Thread01 th1 = new Thread01();
        Thread02 th2 = new Thread02();
        th1.start();
        th2.start();
    }
}

class Thread01 extends Thread{
    public void run(){
        for(int i=0; i<300; i++){
            System.out.print('-');
        }
    }
}

class Thread02 extends Thread{
    public void run(){
        for(int i=0 ;i<300; i++){
            System.out.print('|');
        }
    }
}

