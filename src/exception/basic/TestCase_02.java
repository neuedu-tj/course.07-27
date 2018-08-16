package exception.basic;

public class TestCase_02 {

    public static void main(String[] args) {

        System.out.println( foo(1,1));
    }

    public static int foo(int a , int b ) {
        try {
            return a/b;
        } catch (Exception e ) {
            System.out.println("err");
            return 0;
        } finally {
            System.out.println("不管怎样  我都要执行 ... ");
        }
    }
}
