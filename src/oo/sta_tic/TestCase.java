package oo.sta_tic;

public class TestCase {

   int a = 10;

    static void method() {

    }


    public static void main(String[] args) {
        TestCase  testCase = new TestCase();

        int b = 0;

        int result = testCase.a+b;

        testCase.method();
        TestCase.method();

        Utils u1 = new Utils();
        System.out.println(Utils.NAME);

        Utils.NAME = "jack";
        Utils u2 = new Utils();
        System.out.println(Utils.NAME);



    }
}
