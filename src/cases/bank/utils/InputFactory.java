package cases.bank.utils;

import java.util.Scanner;

public class InputFactory {

	public static Object getInput(TYPE type) {

		Scanner s = new Scanner(System.in);

		Object result = null;

		switch (type.toString()) {

			case "STRING":
				result = s.next();
				break;
			case "INT":
				result = s.nextInt();
				break;
			case "DOUBLE":
				result = s.nextDouble();
				break;

			default:
				break;
		}

		return result;

	}

}
