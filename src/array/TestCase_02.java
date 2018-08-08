package array;

public class TestCase_02 {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = arr1;

        System.out.println(arr2[0]);

        arr2[0] = 10;

        System.out.println(arr1[0]);

    }


}
