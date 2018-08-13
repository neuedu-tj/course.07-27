package util.currency;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class TestCase {

	public static void main(String[] args) throws Exception {
		
		String aaa = "";
		
		StringBuffer sbf = new StringBuffer(aaa);
		sbf.append("a").append("b");
		
		String str = sbf.toString();
		System.out.println(str);
		
		BigDecimal b1 = new BigDecimal("1000");
		BigDecimal b2 = new BigDecimal("1000");
		BigDecimal result = b1.add(b2);
		NumberFormat ins = NumberFormat.getCurrencyInstance();
		ins.setCurrency(Currency.getInstance(Locale.US));

		System.out.println(ins.format(result));
		System.out.println(result);

		
	
	}

}
