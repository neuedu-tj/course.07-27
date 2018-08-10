package oo.abs_class.case_01;

import lombok.Data;

@Data
public class Phone extends Product {

    private String cpu;
    private String memory;

    @Override
    public void detail() {
        System.out.println("一个手机  的  详情 ......... ");
    }

}
