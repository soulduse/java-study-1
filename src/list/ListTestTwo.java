package list;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sould on 2016-01-08.
 */
public class ListTestTwo {

    public static void main(String[] args) {
        List<Object> objList = new ArrayList<Object>();
        layoutList(objList);

        System.out.println(objList.size());
    }

    public static void layoutList(List<Object> list){
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
    }
}
