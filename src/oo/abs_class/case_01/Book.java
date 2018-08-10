package oo.abs_class.case_01;

import lombok.Data;

@Data
public class Book extends Product {

    private String author;
    private String isbn;

    @Override
    public void detail() {
        System.out.println("一本书的  详情 ......... ");
    }
}
