package collection.set;

import java.util.HashSet;
import java.util.Set;

public class TestCase_03 {

    public static void main(String[] args) {

        Emp e1 = new Emp(1 , "A" ,  6000);
        Emp e2 = new Emp(1 , "A" ,  6000);

        Set<Emp> set = new HashSet();
        set.add(e1);
        set.add(e2);

        System.out.println(set);


    }

}
