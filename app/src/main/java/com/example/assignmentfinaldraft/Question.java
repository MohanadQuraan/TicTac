package com.example.assignmentfinaldraft;

public class Question {

    private int questionNum;
    private String question;

    private Answers answer1;
    private Answers answer2;
    private Answers answer3;
    private String correctAnswer;


    public Question(int questionNum, String question, Answers answer1, Answers answer2, Answers answer3, String correctAnswer) {
        this.questionNum = questionNum;
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.correctAnswer = correctAnswer;
    }

    public int getQuestionNum() {
        return questionNum;
    }

    public void setQuestionNum(int questionNum) {
        this.questionNum = questionNum;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Answers getAnswer1() {
        return answer1;
    }

    public void setAnswer1(Answers answer1) {
        this.answer1 = answer1;
    }

    public Answers getAnswer2() {
        return answer2;
    }

    public void setAnswer2(Answers answer2) {
        this.answer2 = answer2;
    }

    public Answers getAnswer3() {
        return answer3;
    }

    public void setAnswer3(Answers answer3) {
        this.answer3 = answer3;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}