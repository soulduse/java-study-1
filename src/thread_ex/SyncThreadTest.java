package thread_ex;

/**
 * Created by sould on 2015-11-02.
 */
public class SyncThreadTest {

    public static void main(String[] args) {

        Washroom wr = new Washroom();
        FamilyThread father     = new FamilyThread("Father", wr);
        FamilyThread mother     = new FamilyThread("Mother", wr);
        FamilyThread sister     = new FamilyThread("Sister", wr);
        FamilyThread brother    = new FamilyThread("Brother", wr);
        FamilyThread me         = new FamilyThread("Me",wr);

        father.start();
        mother.start();
        sister.start();
        brother.start();
        me.start();
    }

}
