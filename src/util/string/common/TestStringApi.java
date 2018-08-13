package util.string.common;

public class TestStringApi {
	
	/*
	 * api
	 * 
	 * */

	public static void main(String[] args) {
		String str = "ABC";
		String email = "hahaha@qq.com";
		String email2 = "hahaha@qq.com@haha";
		String id = "120104197001011234";

		String a = "Hello ";
		String b = "World";

		String skills = "java,node.js,python,scala,SpringBoot,css,hadoop,MongoDb";

		String password = " 66 6666 ";
//		System.out.println(str.toLowerCase());

//		System.out.println("charAt(0) : " + email.charAt(0));
//
//		System.out.println("id 取 4以后" + id.substring(4));  //截取字符串
//		System.out.println("生日 : " + id.substring(6, 14));
//
//		System.out.println("校验 @ 在哪 : " + email.indexOf("@"));     //indexOf( char , index )  //可以说明从哪里以后开始找...
//		System.out.println("校验 qq 在哪 : " + email.indexOf("qq"));
//		System.out.println("校验最后一次 @ 在哪 : " + email2.lastIndexOf("@"));
//
//		String c = a.concat(b);   // a+b
//		System.out.println(c);
//
//		System.out.println("////  我都会什么?  ///");
//		String[] skill = skills.split(",");
//		for (String s : skill) {
//			System.out.println(s);
//		}
//
//		System.out.println("密码 : )   ");
//
		System.out.println(password.trim());  //去掉 两端的  space

	}


}
