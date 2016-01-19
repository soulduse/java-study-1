package string;

/**
 * Created by sould on 2016-01-19.
 */
public class EqualsTest {

    public static void main(String[] args) {
        eqPrint(null);
        eqPrint("two");
        eqPrint("three");
    }

    public static void eqPrint(String str){
        if(str.equals("two")){
            System.out.println(str);
        }
    }


    public static void equalsPrint(String str){
        if("one".equals(str))
        {
            System.out.println(str);
        }
        else if("two".equals(str))
        {
            System.out.println(str);
        }
        else if("three".equals(str))
        {
            System.out.println(str);
        }
        else if("four".equals(str))
        {
            System.out.println(str);
        }
    }
}
