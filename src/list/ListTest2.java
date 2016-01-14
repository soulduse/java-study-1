package list;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sould on 2016-01-13.
 */
public class ListTest2 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        System.out.println(list.size());

        for(int i=0; i<list.size(); i++){
            System.out.println("ok~~");
        }
    }
}
