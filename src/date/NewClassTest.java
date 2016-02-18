package date;

/**
 * Created by sould on 2016-02-01.
 */
public class NewClassTest {

    public static void main(String[] args) {
        A a = new A(1);
        a.print();
        A aa = B.getAClass(5);
        aa = B.getAClass(4);
        aa.print();
    }


}

class A{
    int a;
    A(int a){
        this.a = a;
    }

    public void print(){
        System.out.println(a+"A Class Print!!");
    }
}


class B{
    public static A getAClass(int a){
        return new A(a);
    }
}
