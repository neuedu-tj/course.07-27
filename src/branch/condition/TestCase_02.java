package branch.condition;

import java.util.Scanner;

public class TestCase_02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("----输入购买量----");

        int count = sc.nextInt();

        if(count<=1) {
            System.out.println("不卖 ... ");
        } else if( count > 1 && count <= 5) {
            System.out.println("3 元... 一个");
        } else if( count > 5 && count <= 100) {
            System.out.println("2 元... 一个");
        } else {
            System.out.println("整个店面  卖给你 ......   ");
        }

    }
}
