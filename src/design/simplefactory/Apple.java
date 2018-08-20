package design.simplefactory;

public class Apple extends Fruit{

	@Override
	public void grow() {
		// TODO Auto-generated method stub
		System.out.println("Apple is growing .... ");
	}

	@Override
	public void harvest() {
		// TODO Auto-generated method stub
		System.out.println("Apple has been harvested. ");
	}

	@Override
	public void plant() {
		// TODO Auto-generated method stub
		System.out.println("Apple has been planted . ");
		
	}

}
