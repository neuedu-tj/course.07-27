package loop;

public class TestCase_05 {

    public static void main(String[] args) {

        int size = 9;

        for (int i = 1; i <= size; i++) { //row
            for (int j = 1; j <=i ; j++) {
                System.out.print( i+"*" +j  + "=" + (i*j) +"\t");
            }
            System.out.println();
        }


    }

}
