package oo.class_instance;

public class Test2 {

    public static void main(String[] args) {

        System.out.println("------   start  ");
        //实例化
        Stu jack = new Stu();
        Stu ttt = new Stu();
        jack = ttt;
        ttt.no = 2;
        ttt.name = "tom";
        ttt.age = 30;

        System.out.println("学号 : " + jack.no);
        System.out.println("学号 : " + jack.name);
        System.out.println("学号 : " + jack.age);

        System.out.println("--------------");

        System.out.println("学号 : " + ttt.no);
        System.out.println("学号 : " + ttt.name);
        System.out.println("学号 : " + ttt.age);

//        jack.dev();
//        jack.playGame("吃鸡");

    }

}
