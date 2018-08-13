package util.string.compare;

public class Compare06 {

	public static void main(String[] args) {
		String s1 = new String("计算机"); //堆有一份 , 且拷贝了一份在 常量池中...
		String s2 = s1.intern(); // 计算机    //如果池中不存在 存放一份s1的引用 , 反之将引用取回 .
		String s3 = "计算机";  // s3 直接引用了  s1 池中的备份即可 .

		System.out.println("s1 == s2? " + (s1 == s3));
		System.out.println("s3 == s2? " + (s3 == s2));
	}
}
