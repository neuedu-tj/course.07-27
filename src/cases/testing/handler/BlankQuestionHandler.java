package cases.testing.handler;

import cases.testing.answer.Answer;
import cases.testing.answer.BlankAnswer;
import cases.testing.check.Check;
import cases.testing.constant.Constant;
import cases.testing.question.BlankQuestion;
import cases.testing.question.Question;
import org.apache.commons.lang3.ArrayUtils;



public class BlankQuestionHandler implements Check {

	@Override
	public int check(Question question, Answer answer) {
		
		BlankQuestion blankQuestion = (BlankQuestion)question;
		BlankAnswer blankAnswer = (BlankAnswer)answer;
		
		int score = 0;
		
		if(blankAnswer.getContents()!=null && blankAnswer.getContents().length > 0 ) {
			for (int i = 0; i < blankAnswer.getContents().length; i++) {
				if( ArrayUtils.contains(blankQuestion.getAnswer(),  blankAnswer.getContents()[i]) ) {
					score += Constant.BLANK_SCORE;
				}
			}
		}
		

		return score;
	}

}
