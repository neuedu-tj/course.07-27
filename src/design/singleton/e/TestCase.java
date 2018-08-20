package design.singleton.e;

public class TestCase {
	
	public static void main(String[] args) {

		Connection c1 = Connection.getInstance();
		Connection c2 = Connection.getInstance();

		System.out.println( c1== c2  );
		
	}

}
