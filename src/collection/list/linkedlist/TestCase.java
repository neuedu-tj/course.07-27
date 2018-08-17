package collection.list.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class TestCase {

    public static void main(String[] args) {

        int size = 200000;

        LinkedList link = new LinkedList();
        ArrayList array = new ArrayList();

        long start = System.currentTimeMillis();
        for (int i = 0; i < size ; i++) {
            link.add(0,new Object());
        }
        long end = System.currentTimeMillis();

        System.out.println("add : link : " + (end - start) );

        start = System.currentTimeMillis();
        for (int i = 0; i < size ; i++) {
            array.add(0,new Object());
        }
        end = System.currentTimeMillis();
        System.out.println("add : array : " + (end - start) );

    }
}
