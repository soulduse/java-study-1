package plus;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by sould on 2015-12-03.
 */
public class Plus {



    public static void main(String[] args) {

        //////////////////////////////////////////////////////////
        // 전체값에서 일부값은 몇 퍼센트? 계산
        // 공식은 "일부값 나누기 전체값 곱하기 100"
        //////////////////////////////////////////////////////////

        String sn = "0017863dc042";

        System.out.println(sn.toUpperCase());

        String format = String.format("%.2f", 6.0 / 6.0 * 100.0);
        double poiner = Double.parseDouble(format);
        int number = (int)poiner;

        System.out.println(number);

        int num = 1;

        float fnum = num;

        System.out.println((float)num);
        /*
        System.out.println("int : "+number);
        System.out.println("doble : "+poiner);
        for(int i=0; i<format.length(); i++){
            if(format.charAt(i) == '.'){
                poiner = i;
            }
        }
        */
//        System.out.println(format.substring(0, poiner)+"%");



//        // 10은 100에서 몇 퍼센트?
//        System.out.format("%.2f%%%n", 10.0 / 100.0 * 100.0);
//        // 출력 결과: 10.00%
//
//
//        // 33은 100에서 몇 퍼센트?
//        int x = 33;
//        int y = 100;
//        System.out.println( (double) x / (double) y * 100.0 + "%");
//        // 출력 결과: 33.0%
//        // 정수의 경우에는 (double) 로 실수화시키지 않으면
//        // 0.0 이라는 엉뚱한 값이 나옴
//        // 맨 끝의 + "%" 이 부분은 공식의 일부가 아니라 퍼센트 기호 출력
//
//
//        // 105는 300의 몇퍼센트?
//        double x2 = 105.0;
//        double y2 = 300.0;
//        System.out.format("%.2f%%%n", x2 / y2 * 100.0);
//        // 출력 결과: 35.00%
//        // 실수형 변수에 값을 넣어두는 것이 좋음
//
//
//        // 한달 봉급 156만원인 사람이, 음식 값으로 21만원을 쓰면,
//        // 그 음식값은 한 달 봉급의 몇 퍼센트?
//        System.out.format("%.2f%%%n", 210000.0 / 1560000.0 * 100.0);
//        // 출력 결과: 13.46%
//
//
//        // 만약 봉급 156만원으로 모두 먹는 데 사용했다면
//        // 100% 가 나와야겠지요.
//        System.out.format("%.2f%%%n", 1560000.0 / 1560000.0 * 100.0);
//        // 출력 결과: 100.00%
//
//
//        // 만약 아무것도 먹지 않았면 0% 가 나와야합니다.
//        System.out.format("%.2f%%%n", 0.0 / 1560000.0 * 100.0);
//        // 출력 결과: 0.00%
//
//
//
//
//
//        //////////////////////////////////////////////////////////
//        // 전체값의 몇 퍼센트는 얼마? 계산
//        // 공식은, "전체값 곱하기 퍼센트 나누기 100"
//        //////////////////////////////////////////////////////////
//
//
//        // 100의 10퍼센트는 얼마?
//        System.out.format("%.2f%n", 100.0 * 10.0 / 100.0);
//        // 출력 결과: 10.00
//
//
//        // 100의 33퍼센트는 얼마?
//        System.out.format("%.2f%n", 100.0 * 33.0 / 100.0);
//        // 출력 결과: 33.00
//
//
//        // 300의 35퍼센트는 얼마?
//        System.out.format("%.2f%n", 300.0 * 35.0 / 100.0);
//        // 출력 결과: 105.00
//
//
//        // 156만원의 13.46퍼센트는 얼마?
//        System.out.format("%.2f%n", 1560000.0 * 13.46 / 100.0);
//        // 출력 결과 (21만원에 가까운 값): 209976.00
//
//
//        // 156만원의 100퍼센트는 얼마?
//        System.out.format("%.2f%n", 1560000.0 * 100.0 / 100.0);
//        // 출력 결과: 1560000.00
//
//
//        // 156만원의 0퍼센트는 얼마?
//        System.out.format("%.2f%n", 1560000.0 * 0.0 / 100.0);
//        // 출력 결과: 0.00


    }
}