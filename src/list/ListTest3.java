package list;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sould on 2016-01-15.
 */
public class ListTest3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> copyList = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);



        for(int i=0; i<list.size(); i++){
            int sum = 0;
            for(int j=0; j<list.size(); j++){
                sum += list.get(j);
            }
            copyList.add(sum);
        }


        for(int i=0; i<copyList.size(); i++){
            System.out.println(copyList.get(i));
        }

//        System.out.println("result : "+sum);
    }
}
