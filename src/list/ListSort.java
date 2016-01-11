package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by sould on 2016-01-11.
 */
public class ListSort {
    public static Person person = null;
    public static List list = null;

    public static void main(String[] args) {

        list = new ArrayList();
        print(addReturnData());
    }


    private static List<Person> addReturnData(){
        person = new Person();
        person.setName("홍길동");
        person.setNumber(0);
        list.add(person);
        person = new Person();
        person.setName("김현우");
        person.setNumber(3);
        list.add(person);
        person = new Person();
        person.setName("철수김");
        person.setNumber(4);
        list.add(person);
        person = new Person();
        person.setName("김영희");
        person.setNumber(2);
        list.add(person);
        person = new Person();
        person.setName("고수");
        person.setNumber(1);
        list.add(person);

        return list;
    }

    private static void print(List<Person> list){
        Collections.sort(list, new NoAscCompare());
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i).getName());
            System.out.println(list.get(i).getNumber());
        }
    }

}

class Person{
    String name = "";
    int number = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

class NoAscCompare implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getNumber() < o2.getNumber() ? -1 : o1.getNumber()>o2.getNumber() ? 1:0;
    }
}
