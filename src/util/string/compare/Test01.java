package util.string.compare;

public class Test01 {
	
	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = new String("Hello");
		char[] msg = {'H' , 'e' ,'l' , 'l' , 'o'};
		String s3 = new String(msg);
		byte[] msg2 = {65,66,67};
		String s4 = new String(msg2);
		System.out.println(s3);
		
		
	}

}
