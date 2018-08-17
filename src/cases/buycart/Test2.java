package cases.buycart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		Product p1 = new Product(1, "Java从入门到精通", 100);
		Product p2 = new Product(2, "iphone 8", 10);
		Product p3 = new Product(3, "nokia 8", 160);
		Product p4 = new Product(4, "sumsang", 90);

		List<Product> products = new ArrayList<Product>();
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);

		Collections.sort(products);

		for (Product product : products) {
			System.out.println(product);
		}

	}


}
