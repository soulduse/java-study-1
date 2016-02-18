package loop;

/**
 * Created by sould on 2016-02-03.
 */
public class WhileTest {
    public static void main(String[] args) {
        int i=0;
        int cnt = 0;

        while(i==0){
            try{
                Thread.sleep(1000);
                System.out.println("ok");

                if(cnt == 5){
                    i = 2;
                }
                cnt++;

            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
