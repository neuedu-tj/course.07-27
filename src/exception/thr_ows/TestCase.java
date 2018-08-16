package exception.thr_ows;

public class TestCase {

    public static void main(String[] args) {

        FooHandler handler = new FooHandler();
        try {
            handler.cacl(1,0);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
