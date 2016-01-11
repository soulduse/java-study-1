package map;

import java.util.*;

/**
 * Created by sould on 2016-01-11.
 */
public class MapKeySort {

    public static void main(String[] args) {
        Map <String, Object> map = new HashMap<String, Object>();
        map.put("mon", 1);
        map.put("tue", 2);
        map.put("wed", 3);
        map.put("thu", 4);
        map.put("fri", 5);
        map.put("sat", 6);
        map.put("sun", 7);

        System.out.println(map);

        Iterator it = sortByValue(map).listIterator();

        while(it.hasNext()){
            String temp = (String)it.next();
            System.out.println(temp + " = "+map.get(temp));
        }
    }

   public static List sortByValue(final Map map){
       List<String> list = new ArrayList<String>();
       list.addAll(map.keySet());

       Collections.sort(list, new Comparator<String>() {
           @Override
           public int compare(String o1, String o2) {
               Object v1 = map.get(o1);
               Object v2 = map.get(o2);

               return ((Comparable) v1).compareTo(v2);
           }
       });
       return list;
   }
}
