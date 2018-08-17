package cases.buycart;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Item {

	private Product product;
	private int amount;

	public Item(Product product, int amount) {
		this.product = product;
		this.amount = amount;
	}

	@Override
	public boolean equals(Object obj) {
		Item item01 = this;
		Item item02 = (Item) obj;
		
		if (item01.getProduct().getId() == item02.getProduct().getId()) {
			return true;
		} else {
			return false;
		}
		
	}

}
