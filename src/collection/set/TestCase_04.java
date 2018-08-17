package collection.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestCase_04 {

    public static void main(String[] args) {

        Emp e1 = new Emp(1 , "A" ,  2000);
        Emp e2 = new Emp(2 , "C" ,  4000);
        Emp e3 = new Emp(3 , "B" ,  6000);

        Set<Emp> set = new TreeSet();
        set.add(e1);
        set.add(e2);
        set.add(e3);

        System.out.println(set);


    }

}
