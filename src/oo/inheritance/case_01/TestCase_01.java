package oo.inheritance.case_01;

public class TestCase_01 {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setColor("black");
        dog.setNickname("tom");

        dog.sayHello();

        Person person = new Person();
        person.setCet("4");
        person.setNickname("张三");

        person.sayHello();

    }

}
