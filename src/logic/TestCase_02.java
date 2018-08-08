package logic;

import java.util.Scanner;

public class TestCase_02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("欢迎进入系统");
        System.out.println("请输入账户类型 ");
        String account = sc.next();


        System.out.println( account.equals("1") || account.equals("2") );



    }
}
