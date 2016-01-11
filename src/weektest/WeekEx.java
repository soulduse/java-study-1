package weektest;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.util.*;

/**
 * Created by sould on 2015-12-24.
 */
public class WeekEx {

    public static void main(String[] args){
        WeekEx weekEx = new WeekEx();
//        System.out.println(weekEx.getDay());
//        System.out.println(weekEx.getCurWeek());

        ArrayList<String> list = new ArrayList<String>();
        list.add("mon");
        list.add("tue");
        list.add("thu");
        list.add("sat");

//        System.out.println(weekEx.dateMaker(list));

//        for(int i=0; i<list.size(); i++){
//            System.out.println(weekEx.dateMaker(list.get(i).toString()));
//        }
    }

    public String dateMaker(String week){
        final String[] weekArr = {"sun","mon", "tue", "wed", "thu", "fri", "sat"};
        int yoilNum = -1;
        for(int i=0; i<weekArr.length; i++){
            if(weekArr[i].equals(week)){
                yoilNum = i+1;
            }
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_WEEK, yoilNum);
        String dateStr = simpleDateFormat.format(calendar.getTime());

        return dateStr;
    }

    public String dateMaker(List<String> weekList){
        final String[] weekArr = {"sun","mon", "tue", "wed", "thu", "fri", "sat"};
        int yoilNum = -1;
        for(int i=0; i<weekList.size(); i++){
            String week = weekList.get(i);
            for(int j=0; j<weekArr.length; j++){
                if(weekArr[j].equals(week)){
                    yoilNum = j+1;
                }
            }
        }

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_WEEK, yoilNum);
        String dateStr = simpleDateFormat.format(calendar.getTime());

        return dateStr;
    }

    public String makeDate(String stateTime){
        String mkStr = getDay()+"-"+stateTime;
        return mkStr;
    }

    public String getCurWeek(){
        final String[] week = {"sun","mon", "tue", "wed", "thu", "fri", "sat"};
        Calendar mCalendar = Calendar.getInstance();
        int num = mCalendar.get(Calendar.DAY_OF_WEEK)-1;
        String today = week[num];

        return today;
    }



    public String getDay(){        // 현재 요일,년월일 구하는 함수.
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE,yyyyMMdd", Locale.ENGLISH);
        Date curretTime = new Date();
        String mTime = simpleDateFormat.format(curretTime);

        return mTime;
    }

    // 요일 데이터 관리
    public List<String> getWeekList(){
        List<String> list = new ArrayList<String>();
        list.add("mon");
        list.add("sun");

        return list;
    }

	/*
	 * date & week ==>> longType(1000)
	 * params 1:date(20151010-090000), 2:weekList("mon","sun")
	 */

    public void weekEqulas(String startDate, String endDate, List<String> weekList)
    {
        String[] startArr   = startDate.split(",");
        String[] endArr     = endDate.split(",");
        String weekType     = startArr[0];
        String start        = startArr[1];
        String end          = endArr[1];


        for(int i=0; i<weekList.size(); i++){
            if(weekType.equalsIgnoreCase(weekList.get(i))) {
                //Log.d("일치 ","OK");
                //Log.d("startDate ", start);
                //Log.d("endDate ", end);
//                System.out.println(schChangeCheck(timeTransformation(start), timeTransformation(end)));
            }
        }
    }

    public String[] weekCalendar(String yyyymmdd) throws Exception{

        Calendar cal = Calendar.getInstance();
        int toYear = 0;
        int toMonth = 0;
        int toDay = 0;
        if(yyyymmdd == null || yyyymmdd.equals("")){   //파라메타값이 없을경우 오늘날짜
            toYear = cal.get(cal.YEAR);
            toMonth = cal.get(cal.MONTH)+1;
            toDay = cal.get(cal.DAY_OF_MONTH);

            int yoil = cal.get(cal.DAY_OF_WEEK); //요일나오게하기(숫자로)

            if(yoil != 1){   //해당요일이 일요일이 아닌경우
                yoil = yoil-2;
            }else{           //해당요일이 일요일인경우
                yoil = 7;
            }
            cal.set(toYear, toMonth-1, toDay-yoil);  //해당주월요일로 세팅
        }else{
            int yy =Integer.parseInt(yyyymmdd.substring(0, 4));
            int mm =Integer.parseInt(yyyymmdd.substring(4, 6))-1;
            int dd =Integer.parseInt(yyyymmdd.substring(6, 8));
            cal.set(yy, mm,dd);
        }
        String[] arrYMD = new String[7];

        int inYear = cal.get(cal.YEAR);
        int inMonth = cal.get(cal.MONTH);
        int inDay = cal.get(cal.DAY_OF_MONTH);

        for(int i = 0; i < 7;i++){
            cal.set(inYear, inMonth, inDay+i);  //
            String y = Integer.toString(cal.get(cal.YEAR));
            String m = Integer.toString(cal.get(cal.MONTH)+1);
            String d = Integer.toString(cal.get(cal.DAY_OF_MONTH));
            if(m.length() == 1) m = "0" + m;
            if(d.length() == 1) d = "0" + d;

            arrYMD[i] = y+m +d;
            System.out.println("ymd ="+ y+m+d);

        }

        return arrYMD;
    }
}
