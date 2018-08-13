package util.stringBuffer;

public class Test {
	
	public static void main(String[] args) {
		
		StringBuffer sbf = new StringBuffer("Java");
		sbf.append(",");
		sbf.append("C#");
		
		for (int i = 0; i < 13; i++) {
			sbf.append(i);
		}  
		
		sbf.append("oracle").append("node.js").append("haha");
		
		System.out.println(sbf);
		
		Test t = new Test();
		t.append("").append("").append("");
	}

	
	public Test append(String str) {
		
		
		
		return this;
	}
}
