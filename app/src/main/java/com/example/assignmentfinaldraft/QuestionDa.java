package com.example.assignmentfinaldraft;

import java.util.ArrayList;

public class QuestionDa {
    private ArrayList<Question> questions=new ArrayList<>();
    public QuestionDa(){

        questions.add(new Question(1,"what is the biggest animal?","elephant"
        ,"blue whale","white whale","blue whale"));

        questions.add(new Question(2,"what is the fastest animal?","rabbit"
                ,"cheetah","horse","cheetah"));

        questions.add(new Question(3,"one of these is not a bird","bee"
                ,"parrot","pigeon","bee"));

    }
    public Question getQuestion(int qNum){

       for(Question q:questions ) {
           if(q.getQuestionNum()==qNum){
               return q;
           }

       }

return null;
    }
}
