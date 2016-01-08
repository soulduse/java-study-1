package timer;

import java.io.File;
import java.util.Date;

/**
 * Created by sould on 2016-01-04.
 */
public class StringConcatEx {

    public static void main(String[] args) {

        System.out.println(getStr());

        File file = new File("aaa", "A.txt");	//Directory, file이름
        file.mkdirs();
        System.out.println(file.getPath());
        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.isAbsolute());
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.length());					//file의 byte 크기
        System.out.println(new Date(file.lastModified()));	//마지막으로 수정된 날짜를 return

        String[] listing = new File("aaa").list();
        for(int i=0; i<listing.length; i++){
            System.out.println(new File("aaa", listing[i]));
        }

    }

    public static String getStr(){
        String path = "ok";
        path = path.concat("/hi~");


        return path;
    }
}
