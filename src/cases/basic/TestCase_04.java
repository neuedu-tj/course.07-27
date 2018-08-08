package cases.basic;

import java.util.Scanner;

public class TestCase_04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int size = 10;

        int i = 1;

        while( i <= size ) {

            if( i ==1 || i == size ) {
                for (int j = 2; j <= size ; j++) {
                    System.out.print("O");
                }
            } else {
                for (int j = 2; j <= size ; j++) {
                    if( j==2 || j == size ) {
                        System.out.print("O");
                    } else {
                        System.out.print("M");
                    }
                }
            }
            i++;
        }
    }

}
