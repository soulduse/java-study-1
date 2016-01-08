package date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Created by sould on 2016-01-06.
 */
public class DateTest {

    public static final String DATE_FORMAT = "yyyyMMdd-HHmmss";

    public static void main(String[] args) {
    }

    public static String getTodayString(String pattern){
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        String today = (new SimpleDateFormat(pattern).format(date));

        return today;
    }


    public static Date getToday(String pattern)
    {
        Date tempDate = null;
        try
        {
            SimpleDateFormat formatter = new SimpleDateFormat( pattern, Locale.KOREA );
            DateFormat sdFormat = new SimpleDateFormat(pattern);
            tempDate = sdFormat.parse(formatter.format ( new Date() ));

        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return tempDate;

    }
}
