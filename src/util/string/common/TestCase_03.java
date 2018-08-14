package util.string.common;

public class TestCase_03 {

    public static void main(String[] args) {

        String str = "";

        long start = System.currentTimeMillis();

        for (int i = 0; i < 200000 ; i++) {
//            str += i; // i --> String    // new String
            str.concat("a");
        }

        long end = System.currentTimeMillis();


        System.out.println(end - start );

    }
}
