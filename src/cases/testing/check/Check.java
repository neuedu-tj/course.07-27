package cases.testing.check;


import cases.testing.answer.Answer;
import cases.testing.question.Question;

public interface Check {
	
	int check(Question question, Answer answer);

}
