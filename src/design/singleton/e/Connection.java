package design.singleton.e;

public class Connection {
	
	private static Connection connection = new Connection();  
	
	private Connection(){
	}
	
	public static Connection getInstance() {

		return connection;
	}

}
