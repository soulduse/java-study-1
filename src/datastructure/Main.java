package datastructure;

/**
 * Created by sould on 2015-11-16.
 */
public class Main {



    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        ArrayList.ListIterator it = list.listIterator();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);

        while(it.hasNext()){
            Integer value = (Integer)it.next();
            System.out.println(value);
        }

    }
}
