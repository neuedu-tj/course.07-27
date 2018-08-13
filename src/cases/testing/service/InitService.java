package cases.testing.service;


import cases.testing.constant.Constant;
import cases.testing.question.BlankQuestion;
import cases.testing.question.ChoiceQuestion;
import cases.testing.question.Question;
import cases.testing.question.support.Option;

public class InitService {

	//所有的考试题
	private Question[] questions;

	//选择题数量
	private int choiceAmount;
	//填空题数量
	private int blankAmount;
	//填空题  " 空 " 的个数 .
	private int blankItemAmount;

	public Question[] getQuestions() {

		return questions;
	}

	public void setQuestions(Question[] questions) {
		this.questions = questions;
	}

	//初始化题目
	public void init(Question[] questions) {

		setQuestions(questions); // 给成员变量  questions 赋值 .

		if (questions != null && questions.length > 0) {
			calcuTotalScore(); // 算分值
			showQuestions();  // 显示题目
		}

	}

	public void calcuTotalScore() {
		for (int i = 0; i < questions.length; i++) {
			if(questions[i] instanceof ChoiceQuestion) {
				choiceAmount += 1;
			} else if(questions[i] instanceof BlankQuestion) {
				blankAmount +=1;
				BlankQuestion blankQuestion = (BlankQuestion) questions[i];
				blankItemAmount += blankQuestion.getAnswer().length ;  //有几个答案 证明有几个空.
			}
		}

		System.out.println("选择题共 : "+ (choiceAmount) +"道 , 每题 : "+Constant.CHOICE_SCORE+"分 , 共 " + (choiceAmount)*Constant.CHOICE_SCORE + " 分 . ");

		System.out.println("填空题共 : " + (blankAmount) +"道 , 每空 : " + Constant.BLANK_SCORE + "分 , 共 " + (blankItemAmount) * Constant.BLANK_SCORE + " 分 . ");

		System.out.println("--------------------------------------------");
	}

	public void showQuestions() {
		for (int i = 0; i < questions.length; i++) {

			System.out.println("题目 " + (i + 1) + " : " + questions[i].getTitle());
			if (questions[i] instanceof ChoiceQuestion) { // 选择题
				ChoiceQuestion choice = (ChoiceQuestion) questions[i];
				for (Option option : choice.getOptions()) {
					System.out.println(option.getKey() + " . " + option.getText());
				}
				System.out.println("***************************");
			}

		}
	}

}

