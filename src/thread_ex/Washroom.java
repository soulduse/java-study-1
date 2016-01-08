package thread_ex;

/**
 * Created by sould on 2015-11-02.
 */
public class Washroom {

    public synchronized void openDoor(String name){
        System.out.println(name +" 입장");
        for(int i=0; i<10000000; i++){
            if(i==10000)
                System.out.println(name + " : 끄으응~~");
        }
        System.out.println(name + " : 아 시원해~");
    }
}
