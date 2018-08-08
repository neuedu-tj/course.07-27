package cases.basic;

public class TestCase_06 {


    //100$    100 只
    //公鸡 : 5  母鸡 : 3  小鸡 1/3
    public static void main(String[] args) {

        for( int x = 0 ; x <= 100 ; x++) {
           for( int y = 0 ; y<=100 ; y++) {
               for(double z = 0 ; z <= 100 ; z++) {
                   if( (x*5 + y*3 + z/3) ==100 && (x + y + z) == 100 ) {
                       System.out.println( x + " , " + y + " , " + z  );
                   }
               }
           }
        }
    }

}
