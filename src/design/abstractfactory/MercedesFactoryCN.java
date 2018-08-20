package design.abstractfactory;

public class MercedesFactoryCN implements MercedesFactory{

	@Override
	public BenzA createBenzA() {
		System.out.println("在天朝 : 生产一辆 A级车 ");
		return new BenzACN();
	}

	@Override
	public BenzB createBenzB() {
		System.out.println("在天朝 : 生产一辆 B级车 ");
		return new BenzBCn();
	}

}