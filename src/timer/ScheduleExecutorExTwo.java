package timer;

import java.util.*;
import java.util.concurrent.Exchanger;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by sould on 2016-02-02.
 */
public class ScheduleExecutorExTwo {
    private static final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
    private static TemplateItem templateItem = null;
    private static final String [] CONTENTS_ARRAY = {"사진1","사진2","사진3","사진4","사진5"};

    public static void main(String[] args) {

        List<TemplateItem> itemsList = getItems();
        for(int i=0; i<itemsList.size(); i++){
            String conatents = itemsList.get(i).getContents();
            int frame = itemsList.get(i).getFrameNumber();
            int repeat= itemsList.get(i).getRepeat();
            System.out.println("frame : "+frame+" / contents : "+conatents+" / repeate : "+repeat);
        }


        startSch();

    }

    private static List<TemplateItem> getItems(){
        List<TemplateItem> itemList = new ArrayList<TemplateItem>();
        for(int i=0; i<4; i++){
            int random = (int)(Math.random()*4)+1;
            for(int j=0; j<random; j++){
                templateItem = new TemplateItem();
                templateItem.setRepeat(5);
                templateItem.setContents(CONTENTS_ARRAY[j]);
                templateItem.setFrameNumber(i+1);
                itemList.add(templateItem);
            }
        }

        return itemList;
    }

    private static void startSch(){
        Runnable command = new Runnable() {
            @Override
            public void run() {
                try{
                    System.out.println("rolling");
                    System.out.println(new Date(System.currentTimeMillis()));
                }catch (Exception e){
                    e.printStackTrace();
                }

            }
        };

        scheduler.scheduleAtFixedRate(command, 0, 5, TimeUnit.SECONDS);
    }

    private static void switchStartEnd(){

    }
}

class TemplateItem{
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
