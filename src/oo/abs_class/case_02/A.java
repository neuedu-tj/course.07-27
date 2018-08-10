package oo.abs_class.case_02;

public abstract class A {

    public static final String NAME = "tom";

    A(){
        System.out.println(" constructor A");
    }

    public void method1() {
        System.out.println("method 1 ");
    }

    public abstract void method2();

    public abstract void method3();



}
