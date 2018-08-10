package oo.inter_face.case_02.sub;

import oo.inter_face.case_02.Teacher;
import oo.inter_face.case_02.action.Lesson;
import oo.inter_face.case_02.action.MarkExam;

public class TeacherJava extends Teacher implements Lesson , MarkExam {

    @Override
    public void 上课() {
        System.out.println("Java 老师  开始上课");
    }

    @Override
    public void 补课() {
        System.out.println("Java 老师  开始补课");
    }

    @Override
    public void score() {
        System.out.println(" 给分数 ..... ");
    }
}
