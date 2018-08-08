package logic;

import java.util.Scanner;

public class TestCase_05 {

    public static void main(String[] args) {

        int pageSize = 5;
        System.out.println("请输入总记录数");

        Scanner scanner = new Scanner(System.in);
        int totalRows = scanner.nextInt();

        int result = totalRows%pageSize == 0 ?  totalRows/pageSize :  totalRows/pageSize + 1;

        System.out.println("分页数 : " + result);

    }
}
