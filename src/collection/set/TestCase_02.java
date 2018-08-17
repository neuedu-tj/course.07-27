package collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestCase_02 {

    public static void main(String[] args) {

        Emp e1 = new Emp(1 , "A" ,  9000);
        Emp e2 = new Emp(2 , "B" ,  6000);
        Emp e3 = new Emp(3 , "C" ,  3000);

        Set<Emp> set = new HashSet();
        set.add(e1);
        set.add(e2);
        set.add(e3);

        System.out.println(set);


    }

}
