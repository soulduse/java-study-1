package date;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by sould on 2016-01-11.
 */
public class MakeDate {

    public static final String DATE_FORMAT  = "HH:mm:ss";
    public static final String START_TIME   = "12:00:00";
    public static final String END_TIME     = "18:00:00";

    public static final String SCH_01       = "100";
    public static final String SCH_02       = "200";
    public static final String SCH_03       = "30";
    public static final String SCH_04       = "10";

    public static final String TIME         = "1000";
    public static List<Integer> list    = null;

    public static long startTime  = 0l;
    public static long endTime    = 0l;


    public static void main(String[] args) throws Exception{
        initPrint();
        itemRepeat();
    }

    private static void initPrint(){
        System.out.println("----시작 시간 : "+START_TIME);
        System.out.println("----종료 시간 : "+END_TIME);
        list = new ArrayList<Integer>();
        list.add(100);
        list.add(200);
        list.add(30);
        list.add(10);
        System.out.println("반복 해야 될 시간 : "+list.toString());
        System.out.println("==========================================");
        try{
            startTime = strTypeChangeDate(START_TIME);
            endTime   = strTypeChangeDate(END_TIME);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void itemRepeat() throws Exception{
        while(endTime<=strTypeChangeDate(END_TIME)){
            System.out.println(startTime);
            System.out.println(strTypeChangeDate(END_TIME));
            addItems();
        }
    }

    private static void addItems() throws Exception{
        long copyStartTime = startTime;
        for(int i=0; i<list.size(); i++){
            if(endTime<strTypeChangeDate(END_TIME)){
                System.out.println("시작 시간 : "+longTypeChangeDate(startTime));
                copyStartTime += list.get(i)*1000;
                endTime = copyStartTime;
                System.out.println("종료 시간 : "+longTypeChangeDate(endTime));
                System.out.println("==========================================");
                startTime = endTime;
            }
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
}
