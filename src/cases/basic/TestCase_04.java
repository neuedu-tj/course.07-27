package cases.basic;

import java.util.Scanner;

public class TestCase_04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = 10;

        int i = 0;
        while(i <= size) {
            if(i ==0 || i==size) {
                for (int j = 0; j < size; j++) {
                    System.out.print("* ");
                }
            } else {
                for (int j = 0; j <= size; j++) {
                    if(j==0 || j==size) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();

            i++;
        }

    }

}
