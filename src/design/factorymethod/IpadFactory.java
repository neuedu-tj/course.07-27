package design.factorymethod;

public class IpadFactory implements Factory{

	@Override
	public Product factory() {

		return new Ipad();
	}

}
