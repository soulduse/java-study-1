package list;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sould on 2016-01-13.
 */
public class ListTest2 {
    private final String TAG = getClass().getSimpleName();

    public static void main(String[] args) {
        ListTest2 mListTest = new ListTest2();
        System.out.println(mListTest.TAG);
        List<Integer> listA = new ArrayList<Integer>();
        List<Integer> listB = new ArrayList<Integer>();
        listA.add(1);
        listA.add(2);
        listA.add(3);
        listA.add(4);
        listA.add(5);
        listA.add(6);
        listA.add(7);
//        System.out.println(listA.size());

        mListTest.listInject(listB);
        mListTest.listInject(listB);
        mListTest.listInject(listB);

        System.out.println(listB.size());

        mListTest.listAdd1(listA);
        mListTest.listAdd1(listB);
        mListTest.listAdd2(listA);
        mListTest.listAdd2(listB);
    }

    private void listInject(List<Integer> list){
        list.clear();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
    }

    private void listAdd1(List<Integer> list){
        List<Integer> listB = null;
        listB = list;
        for(int i=0; i<listB.size(); i++){
            System.out.println("listAdd1 : "+listB);
        }
    }

    private void listAdd2(List<Integer> list){
        List<Integer> listB = list;
        for(int i=0; i<listB.size(); i++){
            System.out.println("listAdd2 : "+listB);
        }
    }
}
