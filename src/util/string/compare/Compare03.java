package util.string.compare;

public class Compare03 {


	public static void main(String[] args) {
		String str1 = "str";
		String str2 = "ing";

		// "" 方式创建的字符串对象    之间若采用 "+" 连接 , 产生的新对象会被加入字符串常量池中
		String str3 = "str" + "ing";

		//两个对象的引用    直接通过 "+" 连接 或  通过new方式创建的对象进行 '+'  , 所产生的新对象不会加入字符串常量池中
		String str4 = str1 + str2;
		String str5 = "string";

		System.out.println(str3 == str4);   // false

		System.out.println(str3 == str5);   // true


	}

}
