package thread_ex;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by sould on 2016-02-03.
 */
public class MergeFbTwCall {
    public static void main(String[] args) {
        try{
            ExecutorService executor = Executors.newFixedThreadPool(2);

            List<String> responseFb = new ArrayList<String>();
            List<String> responseTw = new ArrayList<String>();

            Future<List<String>> futureFb = executor.submit(callable(15, 500, "Facebook"));
            Future<List<String>> futureTw = executor.submit(callable(10, 500, "Twitter"));

            responseFb = futureFb.get();
            System.out.println("Facebook Response is Done!");

            responseTw = futureTw.get();
            System.out.println("Twitter Response is Done!");

            // 두 응답이 모두 완료되었을때만 시행.
            if(futureFb.isDone() && futureTw.isDone()){
                System.out.println("Merge Start!");

                for(String string : responseFb){
                    System.out.println(string);
                }

                for(String string : responseTw){
                    System.out.println(string);
                }
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }catch (ExecutionException e){
            e.printStackTrace();
        }

    }

    private static Callable<List<String>> callable(final int cnt, final int speed, final String company){
        Callable callable = new Callable() {
            @Override
            public Object call() throws Exception {
                List<String> list = new ArrayList<String>();

                for(int i=0; i<cnt; i++){
                    System.out.println("get"+company+"Timeline... / line : "+i);

                    Thread.sleep(speed);
                    list.add(company+" timeline : "+ i);
                }
                return list;
            }
        };

        return callable;
    }
}
