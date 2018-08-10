package cases.testing.question;

import lombok.Data;

@Data
public class BlankQuestion extends Question {
	
	protected String[] answer;
	
	public BlankQuestion(String title , String... answer) {
		super(title);
		this.answer = answer;
	}

}
