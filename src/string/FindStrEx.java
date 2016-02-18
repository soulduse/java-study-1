package string;

/**
 * Created by sould on 2016-02-01.
 */
public class FindStrEx {

    public static void main(String[] args) {
        String data = "dd:dddd:0000:";
        String data1 = "dddddd:0000";

        System.out.println(data.contains(":"));

        System.out.println(data.endsWith(":"));
        System.out.println( data.indexOf(":"));
       ;
    }
}
