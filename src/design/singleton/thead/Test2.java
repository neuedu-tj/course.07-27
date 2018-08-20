package design.singleton.thead;


public class Test2 {

	public static void main(String[] args) {

		Handler h= new Handler();

		for (int i = 0; i < 10000; i++) {
			new Thread(h).start();
		}


		System.out.println(h.getConns());


	}

}
