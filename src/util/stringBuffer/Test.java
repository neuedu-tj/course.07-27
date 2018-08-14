package util.stringBuffer;

public class Test {
	
	public static void main(String[] args) {

		StringBuffer sbf = new StringBuffer(20000);

		long start = System.currentTimeMillis();
		for (int i = 0; i < 20000; i++) {
			sbf.append("a");
		}
		long end = System.currentTimeMillis();


		System.out.println(end - start );
		

	}


}
