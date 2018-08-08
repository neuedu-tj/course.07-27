package com.neuedu.array;


import com.sun.istack.internal.NotNull;

public class Array_02 {


    public static void main(String[] args) {
        int a = 1;
        int[] b = {1};

        add1(a);
        add2(b);

        System.out.println(a);
        System.out.println(b[0]);
    }

    //基本类型传 值
    static void add1(int a) {
        a = a + 1;
    }

    //引用类型  传地址
    static void add2(@NotNull  int[] b) {
        b[0] = b[0]+1;
    }



}
