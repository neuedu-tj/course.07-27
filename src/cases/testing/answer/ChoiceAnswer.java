package cases.testing.answer;

import lombok.Data;

@Data
public class ChoiceAnswer extends Answer {
	

	private char[] choice;
	
	public ChoiceAnswer(char[] choice) {
		this.choice = choice;
	}

}
