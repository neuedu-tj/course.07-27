package cases.testing.question;


import cases.testing.question.support.Option;
import lombok.Data;

@Data
public class MultiQuestion extends ChoiceQuestion {

	public char[] answer;


	public MultiQuestion(String title, Option[] options , char[] answer) {
		super(title, options);
		this.answer = answer;
	}

}
