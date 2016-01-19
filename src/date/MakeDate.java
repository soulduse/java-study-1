package date;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by sould on 2016-01-11.
 */
public class MakeDate {
    public static final long ONEDAY= ((1000*60)*60)*24;
    public static final long BASICNUM = 60*60*9*1000;
    public static final String DATE_FORMAT  = "HH:mm:ss";
    public static final String NEW_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
    public static final String START_TIME   = "00:00:00";
    public static final String MID_TIME     = "09:00:00";
    public static final String END_TIME     = "24:00:00";

    public static final String SCH_01       = "100";
    public static final String SCH_02       = "200";
    public static final String SCH_03       = "30";
    public static final String SCH_04       = "10";

    public static final String TIME         = "1000";
    public static List<Integer> list    = null;

    public static long startTime  = 0l;
    public static long endTime    = 0l;
    public static String[] schTime = {"",""};


    public static void main(String[] args) throws Exception{
        initPrint();
//        itemRepeat();

    }

    private static void initPrint() throws Exception{
        System.out.println("----시작 시간  : "+START_TIME);
        System.out.println("----longType : "+strTypeChangeDate(START_TIME));
        System.out.println("----종료 시간 : "+END_TIME);
        System.out.println("----longType : "+strTypeChangeDate(END_TIME));
        System.out.println("==========================================");
        list = new ArrayList<Integer>();
        list.add(100);
        list.add(200);
        list.add(30);
        list.add(10);
        System.out.println("반복 해야 될 시간 : "+list.toString());
        System.out.println("==========================================");
//        itemsAdd();
//        itemAdd();
        try{
            startTime = strTypeChangeDate(START_TIME);
            endTime   = strTypeChangeDate(END_TIME);
//            startTime += BASICNUM;
//            endTime += BASICNUM;

            String [] arr = {"",""};
            String [] copyArr = {"",""};

            System.out.println("Long Change : start : "+startTime+" / end : "+endTime);
            long dateLong = 1452834*1000000l;
            System.out.println(longDateChange(dateLong));

            String startDateTime = START_TIME;
            String endDateTime = END_TIME;
/*
            for(int i=0; i<list.size(); i++){
                int playTime = list.get(i);
//                startTime += playTime*1000;
//                startDateTime = longTypeChangeDate(startTime);
//                System.out.println("startDate : "+startDateTime+" / endDate : "+longTypeChangeDate(startTime));
                if(!arr[0].equals("") && !arr[1].equals("")){
                    System.out.println("arr[0]"+arr[0]);
                    startDateTime = arr[0];
                    endDateTime = arr[1];
                }
                arr = itemArrAdd(startDateTime, endDateTime, playTime);

                System.out.println(arr[0]);
                System.out.println(arr[1]);
            }
            //*/

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static String[] itemArrAdd(String startTime, String endTime, int playTime) throws Exception{
        String[] schTime = {"",""};
        long lstatrTime = strTypeChangeDate(startTime);
        long lendTime = strTypeChangeDate(endTime);

        System.out.println("startTime !! "+startTime);
        if(lstatrTime<=lendTime){
            lstatrTime += playTime * 1000;
            schTime[0] = startTime;
            schTime[1] = longTypeChangeDate(lstatrTime);
        }
        return schTime;
    }



    private static void itemAdd()throws Exception{
        long startTime = strTypeChangeDate(START_TIME);
        long endTime = strTypeChangeDate(END_TIME);
        long addItemTime = startTime;

        String startDate = "";
        String endDate = "";
        int count = 0;

        System.out.println("start : "+startTime+ " / end : "+endTime);

        for(int i=0; i<list.size(); i++){
            if(addItemTime<=endTime){
                System.out.println("================================");
                startDate = longTypeChangeDate(addItemTime);
                System.out.println("시작 시간 : "+startDate);
                addItemTime += list.get(i)*1000;
                endDate = longTypeChangeDate(addItemTime);
                System.out.println("종료 시간 : "+endDate);
                count++;
            }
        }
    }

    private static void itemsAdd()throws Exception{
        long startTime = strTypeChangeDate(START_TIME);
        long endTime = strTypeChangeDate(END_TIME);
        long addItemTime = startTime;

        String startDate = "";
        String endDate = "";
        int count = 0;

        System.out.println("start : "+startTime+ " / end : "+endTime);
        while(addItemTime<=endTime){
            for(int i=0; i<list.size(); i++){
//              addItemTime += list.get(i)*1000;
                if(addItemTime<=endTime){
                    System.out.println("================================");
                    startDate = longTypeChangeDate(addItemTime);
                    System.out.println("시작 시간 : "+startDate);
                    addItemTime += list.get(i)*1000;
                    endDate = longTypeChangeDate(addItemTime);
                    System.out.println("종료 시간 : "+endDate);
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static long strTypeChangeDate(String schDate) throws Exception{
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
        return sdf.parse(schDate).getTime();
    }

    public static String longTypeChangeDate(long time){
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
        return sdf.format(time);
    }

    public static String longDateChange(long date){
        SimpleDateFormat sdf = new SimpleDateFormat(NEW_DATE_FORMAT);
        return sdf.format(date);
    }
}
