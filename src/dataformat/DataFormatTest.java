package dataformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by sould on 2015-11-24.
 */
public class DataFormatTest {

    public static final String DATE_FORMAT1 	= "yyyy-MM-ddHH:mm:ss";
    public static final String TIME_FORMAT 		= "";
    public static final String DATE_FORMAT 		= "yyyyMMdd-HHmmss";


    public static void main(String[] args) {

        System.out.println(timeTransformation("2015-11-24" + "11:59:59"));
        System.out.println(timeTransformation("0000-00-00" + "00:00:00"));
        System.out.println(timeTransformation2("00000000-000000"));


        if(timeTransformation2("00000000-000000")<0){
            System.out.println("HI");
        }
    }

    public static long timeTransformation(String date)
    {
        Date transdate= null;
        try {
            SimpleDateFormat formatter = new SimpleDateFormat(DATE_FORMAT1+TIME_FORMAT);
            transdate = formatter.parse(date);

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return transdate.getTime();// / 1000;
    }

    public static long timeTransformation2(String date)
    {
        Date transdate= null;
        try {
            SimpleDateFormat formatter = new SimpleDateFormat(DATE_FORMAT);
            transdate = formatter.parse(date);

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return transdate.getTime();// / 1000;
    }


}
