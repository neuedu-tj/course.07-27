package collection.list.arraylist;

import collection.list.support.Stu;

import java.util.ArrayList;
import java.util.Date;

public class TestCase_02 {

    public static void main(String[] args) {

        ArrayList stus = new ArrayList();

        Stu s1 = new Stu(1, "tom");
        Stu s2 = new Stu(2, "Jack");

        stus.add(s1);
        stus.add(s2);

        Stu s3 = new Stu(1, "tom");


        System.out.println(stus.contains(s3));


    }
}
