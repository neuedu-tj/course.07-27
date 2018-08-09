package oo.inheritance.case_03;

public class C  extends B {

    {
        System.out.println("代码块");
    }

    static {
        System.out.println("静态块");
    }

    public C() {
        System.out.println(" new C ");
    }
}
