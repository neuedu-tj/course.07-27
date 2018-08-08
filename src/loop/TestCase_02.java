package loop;

public class TestCase_02 {

    public static void main(String[] args) {

        double price = 6;
        int count = 3;
        double sum = 0;
        int i = 1;

        while(i <=3 ) {
            sum += price;
            price /= 2;
            i++;
        }

        System.out.println("sum : " + sum);


    }



}
