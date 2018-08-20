package design.simplefactory;

public class FruitFactory {
	
	
	public static Fruit factory( String fruitName )  {
		
		if("apple".equals(fruitName)) {
			System.out.println("包装苹果");
			return new Apple();
		} else if(fruitName.equals("grape")) {
			return new Grape();
		} else {
			return null;
		}
		
		
	}

}
