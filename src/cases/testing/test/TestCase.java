package cases.testing.test;

import cases.testing.answer.Answer;
import cases.testing.answer.BlankAnswer;
import cases.testing.answer.ChoiceAnswer;
import cases.testing.question.*;
import cases.testing.question.support.Option;
import cases.testing.service.CheckService;
import cases.testing.service.InitService;

public class TestCase {

    public static void main(String[] args) {

        // 构造一个单选题
        //题干
        String t1 = "以下说法错误的是? ";
        //单选题的四个选项
        Option so1 = new Option('A', "==可用于基本类型数据的比较");
        Option so2 = new Option('B', "equals()  可用于引用 类型数据的比较");
        Option so3 = new Option('C', "intanseOf 可用于判断对象的类型");
        Option so4 = new Option('D', "String 是基本数据类型");
        Option[] sOptions = { so1, so2, so3, so4 };
        //代表  此题的正确答案是 D
        char singleAnswer = 'D';

        ChoiceQuestion s1 = new SingleQuestion(t1, sOptions , singleAnswer);

        ////////////////////////////////////////////	//第一题  构造完成

        String t2 = "关于 集合 以下说法正确的是? ";

        Option mo1 = new Option('A', "ArrayList比数组好用");
        Option mo2 = new Option('B', "comparable 接口提供了排序功能");
        Option mo3 = new Option('C', "iterator 是类");
        Option mo4 = new Option('D', "Map继承自 Collection ");
        Option[] mOptions = { mo1, mo2, mo3, mo4 };
        //正确答案的数组
        char[] multiAnswer = { 'A', 'B' };

        ChoiceQuestion m1 = new MultiQuestion(t2, mOptions , multiAnswer); //多选题构造完毕

        //////////////////////////////

        //填空题(1)
        String s3 = "请求提交有_____ , ______ 两种方式 ? " ;
        BlankQuestion b1 = new BlankQuestion(s3, "post" , "get");
        //填空题(2)
        String s4 = "面向对象的三个特征是_____ , _____ , ______ . " ;
        BlankQuestion b2 = new BlankQuestion(s4, "封装" , "继承" , "多态");

        /////////////// 题目
        Question[] questions = { s1 , m1 , b1 , b2};

        //试卷初始化
        InitService invoke = new InitService();
        invoke.init(questions);

        System.out.println("开始答题");
        ///////////
        // 答案
        Answer answer1 = new ChoiceAnswer(new char[] {'D'});
        Answer answer2 = new ChoiceAnswer(new char[] {'B' , 'A' });
        Answer answer3 = new BlankAnswer("get" , "post");
        Answer answer4 = new BlankAnswer("封装" , "继承" , "多态");

        Answer[] answers = {answer1 , answer2 , answer3 , answer4};

        System.out.println(" \n开始判卷\n  ");

        //调用判卷的 Service
        CheckService check = new CheckService(questions , answers);

        check.mark();

        System.out.println("总成绩为 : " + check.getScore());


    }


}
