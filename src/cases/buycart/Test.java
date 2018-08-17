package cases.buycart;

import java.util.Date;

public class Test {

	public static void main(String[] args) {

		Product p1 = new Product(1, "Java从入门到精通", 100);
		Product p2 = new Product(2, "iphone 8", 10);

		Customer c1 = new Customer();
		c1.setId(1);
		c1.setName("tom");

		RecInfo rec1 = new RecInfo(1, "智慧公寓", "保安-jack", true);
		RecInfo rec2 = new RecInfo(2, "neusoft大厦", "保安队长-boss", false);
		RecInfo[] infos = { rec1 , rec2 };

		c1.setRecInfos(infos);

		Item item01 = new Item(p1 , 2 );
		Item item02 = new Item(p2 , 6 );
		Item item03 = new Item(p2 , 1);

		BuyCart cart = new BuyCart();

		cart.addItem(item01);
		cart.addItem(item02);
		cart.addItem(item03);


		//////////////////////
		//查看购物车
		cart.showBuyCart();

		////////////////////
		//生成订单   留给大家.....
		System.out.println("下单............");

		System.out.println("");

		long time = System.currentTimeMillis(); //获取当前时间的 long 值 , 注 : [ 时间是可以用 long 来描述的 ]
		Date now = new Date(); // 获取当前系统时间

		//String.valueOf(time)   代表  将任意基本数据类型 转换为 字符串 , 此处是 将 long 转换为 String
		Orders order = new Orders( String.valueOf(time) , now , rec1 , cart  );
		System.out.println(order.toString());


	}

}
