package design.adapter;

public class Adapter implements Target {
	
	private Adaptee	 adaptee; //适配器
	
	public Adapter() {}
	
	public Adapter( Adaptee adaptee ) {
		super();
		this.adaptee = adaptee;
	}
	

	@Override
	public void foo() {

		adaptee.foo();
	}

	@Override
	public void development() {

		System.out.println("dev java on idea");
	}
}
