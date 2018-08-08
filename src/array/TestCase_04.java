package array;

import java.util.Arrays;

public class TestCase_04 {

    public static void main(String[] args) {

        int[] a = {1,2,3,4,5};
        int[] b = new int[5];

        System.arraycopy(a , 0 , b , 0 , a.length);

        System.out.println(Arrays.toString( b ));
    }


}
