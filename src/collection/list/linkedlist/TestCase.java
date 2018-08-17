package collection.list.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

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


        //////////////
        start = System.currentTimeMillis();
        for (int i = 0; i < size ; i++) {
            int index = (int )(Math.random()*size);
            link.get(index);
        }
        end = System.currentTimeMillis();

        System.out.println("get : link : " + (end - start) );

        start = System.currentTimeMillis();
        for (int i = 0; i < size ; i++) {
            int index = (int )(Math.random()*size);
            array.get(index);
        }
        end = System.currentTimeMillis();
        System.out.println("get : array : " + (end - start) );


    }
}
