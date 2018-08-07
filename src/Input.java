import java.util.Date;
import java.util.Scanner;

public class Input {


    public static void main(String[] args) {

        //实例化 sc 对象 , 从控制台接收用户的输入
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入姓名 : ");

        int age = sc.nextInt();

        System.out.println("您的年龄是 : " + age );


    }
}
