package com.qgstudio.ec.entity;

import java.io.Serializable;

/**
 * 学生答案实体
 * Created by FunriLy on 2017/7/10.
 * From small beginnings comes great things.
 */
public class StudentAnswer implements Serializable {
    private int studentAnswerId;
    private int questionId;
    private String studentAnswer;

    public StudentAnswer() {
    }

    public int getStudentAnswerId() {
        return studentAnswerId;
    }

    public void setStudentAnswerId(int studentAnswerId) {
        this.studentAnswerId = studentAnswerId;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getStudentAnswer() {
        return studentAnswer;
    }

    public void setStudentAnswer(String studentAnswer) {
        this.studentAnswer = studentAnswer;
    }

    @Override
    public String toString() {
        return "StudentAnswer{" +
                "studentAnswerId=" + studentAnswerId +
                ", questionId=" + questionId +
                ", studentAnswer='" + studentAnswer + '\'' +
                '}';
    }
}
