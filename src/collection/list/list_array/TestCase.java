package collection.list.list_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestCase {


    public static void main(String[] args) {

        String[] str = {"a" , "b" , "c"};

        List list = new ArrayList();
        list.add(1);

//        list.toArray() --> Object[]

        List<String> strs = Arrays.asList(str);   //size 不可改变 .. . .

        strs.add("d");

        System.out.println(strs);

    }
}
