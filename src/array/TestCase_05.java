package array;

import java.util.Arrays;

public class TestCase_05 {


    public static void main(String[] args) {

        int[] a = {1,2,3,4,5};

        a = Arrays.copyOf(a , 10);

        System.out.println(Arrays.toString(a));

    }


}
