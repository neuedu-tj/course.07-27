package oo.polymorphism.case_01;

public class TestCase_01 {

    public static void main(String[] args) {

        Product p = new Book();
        p.getName();


        p = new Phone();
        p.getName();


    }
}
