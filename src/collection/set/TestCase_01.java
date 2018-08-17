package collection.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestCase_01 {

    public static void main(String[] args) {

        //数序不保证
        //不能存放重复内容
        Set<String> set = new HashSet();    // 去重复 把 list -> set ()

        set.add("w");
        set.add("a");
        set.add("b");
        set.add("d");
        set.add("e");
        set.add("c");

        Iterator it = set.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println(set);
    }

}
