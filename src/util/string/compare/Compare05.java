package util.string.compare;

public class Compare05 {

	//A和B虽然被定义为常量，但是它们都没有马上被赋值。
	//在运算出s的值之前，他们何时被赋值，以及被赋予什么样的值，都是个变数。
	//因此A和B在被赋值之前，性质类似于一个变量。
	//那么s就不能在编译期被确定，而只能在运行时被创建了。

	public static final String A; // 常量A
	public static final String B; // 常量B
	static {
		A = "ab";
		B = "cd";
	}

	public static void main(String[] args) {
		// 将两个常量用+连接对s进行初始化
		String s = A + B;
		String t = "abcd";
		if (s == t) {
			System.out.println("s等于t，它们是同一个对象");
		} else {
			System.out.println("s不等于t，它们不是同一个对象");
		}
	}
	// s不等于t，它们不是同一个对象
}
