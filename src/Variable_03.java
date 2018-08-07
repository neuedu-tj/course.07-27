public class Variable_03 {


    public static void main(String[] args) {

        //不要用  double / float 做货币运算或其他商业运算 .. . . .

        float d1 = 123.45f;
        float  d2 = 123.1f;
        double d3 = 123.45;
        double d4= 123.1;

        double result = d1 * d2;   //精度不够准确
        double result2 = d3 * d4;   //精度不够准确

        System.out.println( d1 * d2 );
        System.out.println( result );
        System.out.println( result2 );
    }

}
