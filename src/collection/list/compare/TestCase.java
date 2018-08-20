package collection.list.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestCase {

    public static void main(String[] args) {

        Stu s1 = new Stu(1,"A" , 90);
        Stu s2 = new Stu(2,"B" , 50);
        Stu s3 = new Stu(3,"C" , 60);
        Stu s4 = new Stu(4,"D" , 80);
        Stu s5 = new Stu(5,"E" , 40);

        ArrayList<Stu> stus = new ArrayList();
        stus.add(s1);
        stus.add(s2);
        stus.add(s3);
        stus.add(s4);
        stus.add(s5);

        Comparator c = new StuCompare();

        Collections.sort(stus , c);

        for (Stu s : stus  ) {
            System.out.println(s);
        }




    }
}
