package cases.buycart;

import lombok.Data;

@Data
public class Product implements Comparable{

	private int id;
	private String name;
	private double price;

	public Product() {

	}

	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}



	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Object o) {
		Product p1 = this;
		Product p2 = (Product)o;
		
		if(p1.price < p2.price) return 1;
		else if(p1.price > p2.price) return -1;
		else return 0;
	}

}
