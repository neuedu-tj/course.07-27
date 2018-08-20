package design.simplefactory;

import java.util.Calendar;

public class Client {
	
	public static void main(String[] args) {
	
		
		try {
//			Fruit apple = FruitFactory.factory("apple");
			Fruit grape = FruitFactory.factory("grape");
//			Fruit banana = FruitFactory.factory("banana");
			
//			apple.harvest();
			grape.plant();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
