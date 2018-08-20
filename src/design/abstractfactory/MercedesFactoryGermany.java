package design.abstractfactory;

public class MercedesFactoryGermany implements MercedesFactory{
	
	@Override
	public BenzA createBenzA() {
		System.out.println("在本土 : 生产一辆 A级车 ");
		return new BenzAGermany();
	}

	@Override
	public BenzB createBenzB() {
		System.out.println("在本土 : 生产一辆 B级车 ");
		return new BenzBGermany();
	}
	
}
