package thread_ex;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sould on 2016-02-01.
 */
public class ThreadTest {

    private static List<List<Item>> itemList;
    private static final String [] CONTENTS_ARRAY = {"사진1","사진2","사진3","사진4","사진5"};
    private static Rolling rolling = null;
    private static Thread rollingThread = null;

    public static void main(String[] args) {

        ThreadTest threadTest = new ThreadTest();

        itemList = new ArrayList<List<Item>>();

        for(int i=0; i<4; i++){
            itemList.add(getList(i + 1));
        }


        printList(itemList);
        System.out.println();
        threadStart();
    }



    private static List<Item> getList(int frameNum){
        int radom = (int)(Math.random()*5)+1;
        List<Item> itemList = new ArrayList<Item>();
        Item item = null;
        for(int i=0; i<radom; i++){
            item = new Item();
            item.setContents(CONTENTS_ARRAY[i]);
            item.setRepeat(5);
            item.setFrameNumber(frameNum);
            itemList.add(item);
        }

        return itemList;
    }

    private static void printList(List<List<Item>> itemList){
        for(int i=0; i<itemList.size(); i++){

            for(int j=0; j<itemList.get(i).size(); j++){
                String contents = itemList.get(i).get(j).getContents();
                int repeat = itemList.get(i).get(j).getRepeat();
                int frameNum = itemList.get(i).get(j).getFrameNumber();
//                System.out.print("contents : " + contents + " / repeat : " + repeat + " / frameNum : " + frameNum);
//                System.out.println();
            }
//            System.out.println("==================================================================================");
        }
    }

    private static void threadStart(){
        threadIntrrupt();
        rolling = new Rolling();
        rollingThread = new Thread(rolling);
        rollingThread.start();
    }

    private static void threadIntrrupt(){
        if(rolling != null)
        {
            rollingThread.interrupt();
            rollingThread = null;
            rolling = null;
        }
    }


    static class Rolling implements Runnable {

        private int count = 0;
        public Rolling(){

        }

        @Override
        public void run() {
            while(!rollingThread.isInterrupted()){
                try{
                    for(int i=0; i<itemList.size(); i++){
                        for(int j=0; j<itemList.get(i).size(); j++){
                            count = 0;
                            int frame = itemList.get(i).get(j).getFrameNumber();
                            String contents = itemList.get(i).get(j).getContents();
                            int repeat = itemList.get(i).get(j).getRepeat();
                            while(repeat>=count){
                                System.out.print("contents : " + contents + " / repeat : " + repeat + " / frameNum : " + frame);
                                System.out.println();
                                Thread.sleep(1000);
                                count ++;
                            }
                        }

                        System.out.println("==================================================================================");
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }

        private void interruptThread(){
            Thread.currentThread().interrupt();
        }
    }
}

class Item{
    private int repeat = 0;
    private String contents = "";
    private int frameNumber = 0;

    public int getRepeat() {
        return repeat;
    }

    public void setRepeat(int repeat) {
        this.repeat = repeat;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public int getFrameNumber() {
        return frameNumber;
    }

    public void setFrameNumber(int frameNumber) {
        this.frameNumber = frameNumber;
    }
}


