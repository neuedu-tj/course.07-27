package util.string.compare;

public class Compare01 {
	
	public static void main(String[] args) {

		String s1 = "a";
		String s2 = "a";

		System.out.println( s1 == s2 ); //比较地址

		String s3 = new String("a");
		String s4 = new String("a");
		System.out.println( s3 == s4 ); //比较地址
		
	}

}
