package cases.buycat.withExceptionHandler;

import cases.buycat.withExceptionHandler.oo.Product;
import cases.buycat.withExceptionHandler.oo.Result;
import cases.buycat.withExceptionHandler.service.BuyService;

import java.math.BigDecimal;

public class TestCase {

    public static void main(String[] args) {

        Product p1 = new Product(1, "thinking in java" ,  new BigDecimal("99.00"));

        BuyService service = new BuyService();

        Result result = service.buy(p1 , 12);

        System.out.println(result);


    }
}
