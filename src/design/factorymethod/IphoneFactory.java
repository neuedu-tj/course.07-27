package design.factorymethod;

public class IphoneFactory implements Factory{

	@Override
	public Product factory() {
		
		return new Iphone();
	}
}
