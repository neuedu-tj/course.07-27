package collection.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestCase_02 {

    public static void main(String[] args) {

        List list = new ArrayList();


        for (int i = 0; i < 10 ; i++) {
            list.add(i);
        }

        System.out.println(list);


        ListIterator it = list.listIterator();
        while(it.hasNext()) {
            Integer e = (Integer)it.next();
            System.out.println(e);
        }
        System.out.println("------------");
        while(it.hasPrevious()) {
            Integer e = (Integer)it.previous();
            System.out.println(e);
        }




    }
}
