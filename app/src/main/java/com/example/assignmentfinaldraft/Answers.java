package com.example.assignmentfinaldraft;

public class Answers {

    private String answer;
    private int imgID;

    public Answers(String answer, int imgID) {
        this.answer = answer;
        this.imgID = imgID;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getImgID() {
        return imgID;
    }

    public void setImgID(int imgID) {
        this.imgID = imgID;
    }
}
