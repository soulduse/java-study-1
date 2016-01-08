package list;

import java.util.ArrayList;

/**
 * Created by sould on 2015-12-29.
 */
public class ListTest {

    public static void main(String[] args) {
        ArrayList listA = new ArrayList();
        ArrayList listB = new ArrayList();
        listB.add(1);

        System.out.println(listA.size());
        System.out.println(listB.size());

        System.out.println(listA.isEmpty());
        System.out.println(listB.isEmpty());

        System.out.println(listA);
        System.out.println(listB);

        if(listB.isEmpty()){
            listB.clear();
        }

        System.out.println(listA);
        System.out.println(listB);
    }



}
