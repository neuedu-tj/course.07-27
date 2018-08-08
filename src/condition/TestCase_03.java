package condition;

import java.util.Scanner;

public class TestCase_03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("----输入业务编号----");

        int choice = sc.nextInt();
        switch (choice) {
            case  1 :
                System.out.println("---------");
                System.out.println("---欢迎存钱---");
                System.out.println("---------");
                break;
            case  2 :
                System.out.println("---------");
                System.out.println("---取钱  : (   ---");
                System.out.println("---------");
                break;
            case  3 :
                System.out.println("---------");
                System.out.println("--- 转账 ---");
                System.out.println("---------");
                break;
                default:
                    System.out.println("--- 你要干啥 ?  ---");
        }





    }
}
