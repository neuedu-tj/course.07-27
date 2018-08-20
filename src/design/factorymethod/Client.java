package design.factorymethod;

public class Client {
	
	public static void main(String[] args) {
		
		Factory c1 , c2;
		Product p1 , p2;
		
		c1 = new IpadFactory();
		p1 = c1.factory();
		
		c2 = new IphoneFactory();
		p2 = c2.factory();

	}

}
