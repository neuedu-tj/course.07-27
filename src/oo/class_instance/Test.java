package oo.class_instance;

public class Test {

    public static void main(String[] args) {

        System.out.println("------   start  ");
        //实例化
        Stu jack = new Stu();

        System.out.println("学号 : " + jack.no);
        System.out.println("学号 : " + jack.name);
        System.out.println("学号 : " + jack.age);

        jack.dev();
        jack.playGame("吃鸡");

    }

}
