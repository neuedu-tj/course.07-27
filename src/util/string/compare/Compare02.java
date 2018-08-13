package util.string.compare;

public class Compare02 {

	public static void main(String[] args) {
		String s1 = "a";
		String s2 = "a";

//		System.out.println(s1.equals(s2)); // 比较内容

		String s3 = new String("a");
		String s4 = new String("a");
//		System.out.println(s1.equals(s4)); //  比较内容

		///

		//忽略大小写的比较
		String s5 = "A";
		String s6 = "a";
//		System.out.println("忽略大小写 : " + s5.equalsIgnoreCase(s6)); //  忽略大小写比较

		//equals with 'null'
		String s7 = "A";
		String s8 = "";
		String s9 = null;

		System.out.println(s8.equals(s7));
		System.out.println(s7.equals(s8));
		System.out.println(s9.equals(s8));
	}

}
