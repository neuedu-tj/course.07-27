package oo.inheritance.case_01;

import lombok.Data;

@Data
public class Animal {

    private String nickname;

    public void sayHello() {
        System.out.println("default  .... ");
    }


}
