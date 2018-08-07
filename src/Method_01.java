import java.util.Date;

public class Method_01 {


    public static void main(String[] args) {

//        foo("jack" , 90);

//        System.out.println( getTime() );

        System.out.println( add( 1, 1 ) );

    }

    static void foo(String name , int price ) {

        System.out.println("Hello : " + name +" , 你需要支付 : "+ price +" 元");
    }

    static int  add( int a , int b ) {
        return a + b;
    }


    static String getTime() {
        Date date = new Date();
        return date.toString();
    }



}
