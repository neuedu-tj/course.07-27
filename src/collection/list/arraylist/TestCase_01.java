package collection.list.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class TestCase_01 {

    public static void main(String[] args) {

        ArrayList c = new ArrayList();

        c.add(1);
        c.add("1");
        c.add("一");
        c.add(new Date());
        c.add(0 , "Hello");

        c.add(1);   //自动装箱

        System.out.println( c );

//        for (int i = 0; i < c.size(); i++) {
//            System.out.println(c.get(i));
//        }

//        for (Object o : c) {
//            System.out.println( o );
//        }

        System.out.println(c.contains(1));
    }
}
