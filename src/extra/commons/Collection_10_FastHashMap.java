package extra.commons;

import org.apache.commons.collections.FastHashMap;

import java.util.HashMap;
import java.util.Map;

public class Collection_10_FastHashMap {

    public static void main(String[] args){
                 int N = 5000000;
                 long start = System.currentTimeMillis();
                 Map hm = new HashMap(N);
                 for(int i = 0; i < N ; i++){
                         hm.put(new Long(i),"HashMap " + i);
                     }
                 long end = System.currentTimeMillis() - start;
                 System.out.println("HashMap put " + N + " Object using" + (end/1000.0) + "s");
                 start = System.currentTimeMillis();
                 FastHashMap fhm = new FastHashMap(N);
//                 fhm.setFast(false);
                 for(int i = 0; i < N ; i++){
                         fhm.put(new Long(i),"FastHashMap " + i);
                     }
                 end = System.currentTimeMillis() - start;
                 System.out.println("FastHashMap put " + N + " Object using" + (end/1000.0) + "s");


                 start = System.currentTimeMillis();
                 for(int i = 0; i < N ; i++){
                         hm.get(new Long(i));
                     }
                 end = System.currentTimeMillis() - start;
                 System.out.println("HashMap get " + N + " Object using" + (end/1000.0) + "s");
                 fhm.setFast(true);
                 start = System.currentTimeMillis();
                for(int i = 0; i < N ; i++){
                         fhm.get(new Long(i));
                     }
                 end = System.currentTimeMillis() - start;
                 System.out.println("FastHashMap get " + N + " Object using" + (end/1000.0) + "s");

           }
}
