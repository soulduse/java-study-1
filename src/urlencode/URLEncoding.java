package urlencode;

import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * Created by sould on 2015-12-15.
 */
public class URLEncoding {
    public static void main(String[] args) throws Exception{
        String testStr = "배경동영상";
        String korText[] = {"테스트","ㅅㄷㄴㅅ","ㅁㅁ","test1","동영상1"
                ,"동영상2","pdf문서 테스트","타임","아이유","배경동영상",
                "호텔 홍보","국민연금 홍보","정부","가로이미지","ㅇㅇㅇ",
                "PDF문서"};

        for(int i=0; i<korText.length; i++){
            System.out.println(URLEncoder.encode(korText[i], "UTF-8")+" : "+new String(URLEncoder.encode(korText[i], "UTF-8").getBytes("UTF-8")));
        }



//        String urlEncode = URLEncoder.encode(testStr, "UTF-8");
//        String doubleEncode = URLEncoder.encode(urlEncode, "UTF-8");
//        String urlDecode = URLDecoder.decode(urlEncode, "UTF-8");

//        System.out.println(urlEncode);
//        System.out.println(doubleEncode);
//        System.out.println(urlDecode);
    }
}
