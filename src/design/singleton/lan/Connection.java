package design.singleton.lan;

public class Connection {
	
	private static Connection connection = null;
	
	private Connection(){ }

	public static Connection getInstance() {
		if(connection == null) {
			connection = new Connection();
		}
		return connection;
	}
}
