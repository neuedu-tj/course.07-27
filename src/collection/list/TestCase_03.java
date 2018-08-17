package collection.list;

import collection.list.support.Stu;

import java.util.ArrayList;

public class TestCase_03 {

    public static void main(String[] args) {

        String str = "info";

        ArrayList stus = new ArrayList();

//        stus.add(str);
//        System.out.println(stus);
//
//        str = "info2";
//        System.out.println(stus);

        Stu s1 = new Stu(1, "tom");
//        Stu s2 = new Stu(2, "Jack");

        stus.add(s1);
        System.out.println(stus);

        s1.setName("tom2");
        System.out.println(stus);




    }
}
