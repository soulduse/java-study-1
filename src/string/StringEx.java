package string;

/**
 * Created by sould on 2016-01-13.
 */
public class StringEx {

    public static void main(String[] args) {
        String[] arr = {"",""};


        arr[0] = "aa";
        arr[1] = "bb";

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
