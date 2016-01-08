package file;

import java.io.File;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by sould on 2016-01-05.
 */
public class FileDelete {
    public static void main(String[] args) {
        // Calendar 객체 생성
        Calendar cal = Calendar.getInstance() ;
        long todayMil = cal.getTimeInMillis() ;     // 현재 시간(밀리 세컨드)

        System.out.println("today  : " + Calendar.getInstance().getTimeInMillis());
        System.out.println("sysday : " + System.currentTimeMillis());
        long oneDayMil = 24*60*60*1000 ;            // 일 단위

        Calendar fileCal = Calendar.getInstance() ;
        Date fileDate = null ;


        File path = new File("aaa") ;
        File[] list = path.listFiles() ;            // 파일 리스트 가져오기


        for(int j=0 ; j < list.length; j++){

            // 파일의 마지막 수정시간 가져오기
            fileDate = new Date(list[j].lastModified()) ;

            // 현재시간과 파일 수정시간 시간차 계산(단위 : 밀리 세컨드)
            fileCal.setTime(fileDate);
            long diffMil = todayMil - fileCal.getTimeInMillis() ;

            //날짜로 계산
            int diffDay = (int)(diffMil/oneDayMil) ;


            // 3일이 지난 파일 삭제
            if(diffDay > 5 && list[j].exists()){
                list[j].delete() ;
                System.out.println(list[j].getName() + " 파일을 삭제했습니다.");
            }

        }
    }
}
