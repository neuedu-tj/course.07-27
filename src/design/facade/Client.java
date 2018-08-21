package design.facade;

public class Client {

	public static void main(String[] args) {
		
		SecurityFacade facade = new SecurityFacade();
		facade.init();

	}

}
