package timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by sould on 2015-12-28.
 */
public class PrintTimer {
    static Timer jobScheduler = null;

    public static void main(String[] args) {
        timerInit();


        try{
            Thread.sleep(20000);
            timerStop();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void timerInit(){
        System.out.println("timerInit");
        timerStart(1,1000);
        timerStart(2,5000);
        timerStart(3,10000);
    }

    public static void timerStart(int condition, int time){
        ScheduleJob job = new ScheduleJob(condition);
        timerObj(false);
        jobScheduler.scheduleAtFixedRate(job, 1000, time);
    }

    public static void timerStop(){
        timerObj(true);
        jobScheduler.cancel();
    }

    public static void timerObj(boolean deamon){
        jobScheduler = new Timer(deamon);
    }
}

class ScheduleJob extends TimerTask{

    int condition = -1;

    public ScheduleJob(int condition){
        this.condition = condition;
    }

    @Override
    public void run() {
        switch (condition){
            case 1:{
                System.out.println("A==========="+new Date());
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
}