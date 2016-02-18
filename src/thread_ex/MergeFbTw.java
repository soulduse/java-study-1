package thread_ex;

/**
 * Created by sould on 2016-02-03.
 */
public class MergeFbTw {


    public static void main(String[] args) {
        fbThread ft = new fbThread();
        twThread tt = new twThread();

        ft.start();
        tt.start();

        System.out.println("mergeStart");
    }
}

class twThread extends Thread{
    @Override
    public void run() {
        try{
            for(int i=0; i<500; i++){
                sleep(30);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Twitter Response");
    }
}


class fbThread extends Thread{
    @Override
    public void run() {
        try{
            for(int i=0; i<300; i++){
                sleep(50);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("FaceBook Response");
    }
}
