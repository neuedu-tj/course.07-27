package method;

import java.util.Arrays;

public class Method_04 {


    public static void main(String[] args) {

        show("a" , "b" , "c" , "d");

    }

    static void show(String... infos) {

        System.out.println(Arrays.toString(infos));

    }






}
