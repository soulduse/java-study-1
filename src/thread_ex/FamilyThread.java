package thread_ex;

/**
 * Created by sould on 2015-11-02.
 */
public class FamilyThread extends Thread {
    private Washroom wr;
    private String who;

    FamilyThread(String name, Washroom wr){
        who = name;
        this.wr = wr;
    }

    public void run(){
        wr.openDoor(who);
    }

}
