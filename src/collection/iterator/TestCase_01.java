package collection.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestCase_01 {

    public static void main(String[] args) {

        List list = new ArrayList();


        for (int i = 0; i < 10 ; i++) {
            list.add(i);
        }

        System.out.println(list);

//        for (int i = 0; i < list.size(); i++) {
//            list.remove(i);
//        }

//        for (Object o : list) {
//            list.remove(o);
//        }

//        Iterator it = list.iterator();
//        while(it.hasNext()) {
//            Integer e = (Integer)it.next();
//            if(e==5) {
//                it.remove();
//            }
//
//        }

        for(Iterator it2 = list.iterator(); it2.hasNext();) {
            Integer e = (Integer)it2.next();
            if(e==5) {
                it2.remove();
            }
        }

        System.out.println(list);

    }
}
