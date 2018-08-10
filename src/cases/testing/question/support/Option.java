package cases.testing.question.support;

import lombok.Data;

@Data
public class Option {
	
	private char key;
	private String text;

	public Option(char key, String text) {
		this.key = key;
		this.text = text;
	}


}
