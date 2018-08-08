package condition;

import java.util.Scanner;

public class TestCase_01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("----输入购买量----");

        int count = sc.nextInt();

        if(count<=1) return;
        else System.out.println("顾客就是上帝");

        System.out.println("-------");

    }
}
