package com.example.assignmentfinaldraft;

import java.util.ArrayList;

public class QuestionDa {
    private ArrayList<Question> questions=new ArrayList<>();
    public static final Answers[] answers1 = {new Answers("elephant",R.drawable.p1),
            new Answers("blue whale",R.drawable.p1),
            new Answers("white whale",R.drawable.p1)

    };
    public QuestionDa(){

        questions.add(new Question(1,"what is the biggest animal?",new Answers("elephant",R.drawable.p1)
        ,new Answers("blue whale",R.drawable.p1),new Answers("white whale",R.drawable.p1),"blue whale"));


        questions.add(new Question(2,"what is the fastest animal?",new Answers("rabbit",R.drawable.p1)
                ,new Answers("cheetah",R.drawable.p1),new Answers("horse",R.drawable.p1),"cheetah"));



        questions.add(new Question(3,"one of these is not a bird",new Answers("bee",R.drawable.p1)
                ,new Answers("parrot",R.drawable.p1),new Answers("pigeon",R.drawable.p1),"bee"));


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
