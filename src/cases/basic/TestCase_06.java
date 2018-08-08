package cases.basic;

public class TestCase_06 {

    public static void main(String[] args) {

        for(int x = 0; x <=100;x++) {
           for(int y = 0 ; y<=100 ; y++) {
               for( double z = 0 ; z<=100 ; z++) {
                   if( (x+y+z) ==100 && (x*5 + 3*y + z/3)==100) {
                       System.out.println(x +"," + y + "," + z);
                   }
               }
           }
        }


    }

}
