package oo.polymorphism.case_01;

import lombok.Data;

@Data
public class Product {

    private String name;
    private double price;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Product{");
        sb.append("name='").append(name).append('\'');
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
