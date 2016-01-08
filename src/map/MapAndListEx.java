package map;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by sould on 2016-01-04.
 */
public class MapAndListEx {

    public static void main(String[] args) {
        sdContentsListGet();

        for(int i=0; i<sdContentsListGet().size(); i++){
            String fileName = sdContentsListGet().get(i).get("fileName");
            String fileSize = sdContentsListGet().get(i).get("fileSize");

            System.out.println("fileName : "+fileName+" / fileSize : "+fileSize);
        }
    }


    private static List<Map<String, String>> sdContentsListGet(){
        List <Map<String, String>> contentsList = new ArrayList<Map<String, String>>();
        Map<String, String> contentsMap = null;
        File dir = new File("aaa");

        File[] fileList = dir.listFiles();
        try{
            for(int i=0; i<fileList.length; i++){
                contentsMap = new HashMap<String, String>();
                File file = fileList[i];
                if(file.isFile() && !file.getName().startsWith("CS")){
                    contentsMap.put("fileName", file.getName());
                    contentsMap.put("fileSize", file.length()+"");
                    contentsList.add(contentsMap);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return contentsList;
    }
}
