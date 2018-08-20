package util.wrapper;


public class TestCase {

    public static void main(String[] args) {

        String info = "10";

        int result = Integer.parseInt(info);

        System.out.println(result);


        int a = 10;
        new Integer(a);

       String.valueOf(a);

       Integer b = new Integer(10);
       b.intValue();


    }
}
