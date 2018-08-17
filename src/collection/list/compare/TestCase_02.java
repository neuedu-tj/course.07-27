package collection.list.compare;

import java.util.ArrayList;
import java.util.Collections;

public class TestCase_02 {

    public static void main(String[] args) {



        ArrayList<String> strs = new ArrayList();
//        strs.add("b");
//        strs.add("a");
//        strs.add("d");
//        strs.add("c");
        strs.add("III");
        strs.add("VI");
        strs.add("IV");
        strs.add("II");


        Collections.sort(strs);

        for (String s : strs  ) {
            System.out.println(s);
        }




    }
}
