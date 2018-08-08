package cacl;

public class TestCase_05 {

    public static void main(String[] args) {

        int a = 1;

        a = ++a;  // a = 2

        a = a++;  //  a  = 2

        a = a++ + ++a; //  6

        System.out.println(a-- + ++a + a++ +a);  // 25

        System.out.println(a);// 7


    }
}
