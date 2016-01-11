package date;

import java.text.SimpleDateFormat;

/**
 * Created by sould on 2016-01-08.
 */
public class DateAddTest {
    public static final String DATE_FORMAT = "HH:mm:ss";
    public static final String START_TIME  = "12:00:00";
    public static final String START_TIME2 = "12:00:01";
    public static final String END_TIME    = "18:00:00";

    public static void main(String[] args) {
        String startTime = START_TIME;
        try{
            long longTime = strTypeChangeDate(START_TIME);
            System.out.println(longTime);
            System.out.println(longTypeChangeDate(longTime+1000));
            System.out.println(strTypeChangeDate(START_TIME));
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    public static long strTypeChangeDate(String schDate) throws Exception{
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
        return sdf.parse(schDate).getTime();
    }

    public static String longTypeChangeDate(long time){
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
        return sdf.format(time);
    }


    public static void addTimeDate(String time){
        TimeDate mTimeDate = new TimeDate();
        mTimeDate.setTotalTime(time);
    }

}


class TimeDate{
    String totalTime;

    public String getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(String totalTime) {
        this.totalTime = totalTime;
    }
}
