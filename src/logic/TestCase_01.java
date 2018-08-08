package logic;

import java.util.Scanner;

public class TestCase_01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("欢迎进入系统");
        System.out.println("请输入姓名");
        String name = sc.next();
        System.out.println("请输入密码");
        String pwd = sc.next();

        System.out.println( name.equals("tom") && pwd.equals("123") );



    }
}
