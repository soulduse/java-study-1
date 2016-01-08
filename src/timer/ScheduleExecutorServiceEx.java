package timer;

import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by sould on 2015-12-30.
 */
public class ScheduleExecutorServiceEx {
    static int count = 0;
    private static final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

    public static void main(String[] args) {
        ScheduleExecutorServiceEx se = new ScheduleExecutorServiceEx();
        se.timerInit();

        try{
            Thread.sleep(20000);
            timerStop();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void timerInit() {
        System.out.println("timerInit");
        timerStart(1, 1);
        timerStart(2, 5);
        timerStart(3, 10);
    }

    public static void timerStart(final int condition, int time) {
        final Runnable runnable = new Runnable() {
            @Override
            public void run() {
                count ++;

                if(count == 5)
                    count = 0;

                switch (condition){
                    case 1:{
                        if(count == 4){
                            System.out.println("A==========="+new Date());
                        }else{

                        }
                        break;
                    }
                    case 2:{
                        System.out.println("=====B======"+new Date());
                        break;
                    }
                    case 3:{
                        System.out.println("===========C"+new Date());
                        break;
                    }
                }
            }
        };
        scheduler.scheduleAtFixedRate(runnable, 1, time, TimeUnit.SECONDS);
    }

    public static void timerStop() {
        System.out.println("=========================");
        System.out.println("isShutdown :"+scheduler.isShutdown());
        System.out.println("isTerminated :"+scheduler.isTerminated());
        System.out.println("=========================");

        scheduler.shutdownNow();

        System.out.println("=========================");
        System.out.println("isShutdown :"+scheduler.isShutdown());
        System.out.println("isTerminated :"+scheduler.isTerminated());
        System.out.println("=========================");

        try{
            System.out.println(scheduler.awaitTermination(2,TimeUnit.SECONDS));
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}