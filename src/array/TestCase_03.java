package array;

public class TestCase_03 {

    public static void main(String[] args) {

        int[] a = {1,2,3,4,5};
        int[] b = new int[5];

        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }

        b[0] = 10;

        System.out.println(a[0]);

    }


}
