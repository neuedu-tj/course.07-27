package design.singleton.thead;


public class Connection {
	
	private static Connection connection = null;
	
	private Connection(){ }

	public static Connection getInstance() {
		if(connection ==null) {
			synchronized (Connection.class) {
				if(connection==null) {
					connection = new Connection();
				}
			}
		}

//		if(connection == null) {
//			connection = new Connection();
//		}
		return connection;
	}

}
