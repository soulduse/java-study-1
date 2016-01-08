package instance;

/**
 * Created by sould on 2016-01-07.
 */
public class InstanceEx {

    public static void main(String[] args) {

        A a = new A();
        B b = new B();
        C c = new C();

        System.out.println(a instanceof B);
        System.out.println(b instanceof B);
        System.out.println(c instanceof B);
    }
}


class A{
    A(){
        System.out.println("A");
    }
}

class B extends A{
    B(){
        System.out.println("B");
    }
}

class C extends B{
    C(){
        System.out.println("C");
    }
}
