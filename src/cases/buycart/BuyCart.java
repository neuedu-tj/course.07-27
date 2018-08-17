package cases.buycart;

import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class BuyCart {

	private List<Item> items = new ArrayList();

	public void addItem(Item item) {

		if(items.contains(item)) {  // contains  默认调用被比较类型的 equals 方法 , 如果不重写就毫无意义 .
			for (Item i : items) {
				if(i.equals(item)) {
					i.setAmount(i.getAmount() + item.getAmount() );
				}
			}
		} else {
			items.add(item);
		}
	}


	// 显示购物车
	public void showBuyCart() {
		for (Item item : items) {
			System.out.println(item);
		}

	}

}
