package oo.sup_er;

public class B extends A {

    public int a ;

    B(){
//        super(1);
//        System.out.println("init B");
    }

    B(int a , int b) {
        super(b);  //super 必须在第一行 ....
        this.a = a;
    }


    public void foo() {
        super.a = 1;
    }

    @Override
    public void method() {
        super.method();
    }

    public static void main(String[] args) {

//        B b = new B();
//        b.foo();
//
//
//        System.out.println(b.a);


//        B b = new B(1,2);
//        System.out.println(b.a);

        B b = new B();
        b.method();

    }


}
