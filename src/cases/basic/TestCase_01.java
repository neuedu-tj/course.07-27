package cases.basic;

public class TestCase_01 {

    public static void main(String[] args) {

        double sum = 0.0d;

        double interest = 3/100d;

        double principal = 1000;

        double each = 0.0d;

        int year = 2;

        for (int i = 1; i <= year; i++) {

                if(each==0.0d) {
                    each = (principal) + (principal*interest);
                }else {
                    each = (each) + (each*interest);
                }


                sum += each;
        }

        System.out.println(sum);

    }
}
