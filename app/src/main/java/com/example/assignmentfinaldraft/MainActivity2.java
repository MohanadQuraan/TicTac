package com.example.assignmentfinaldraft;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    public static int counter=0;
    public static int score=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2_main);
        RecyclerView recycler = findViewById(R.id.question_recycler);
        Answers[] answers = new Answers[3];
    }
    public void btnStartOnClick(View view) {

        counter++;

        QuestionDa objQuestion = new QuestionDa();
        if(counter<4) {
            Question question = objQuestion.getQuestion(counter);
            if(counter>1){
                Question precQuestion = objQuestion.getQuestion(counter-1);

                if (precQuestion.getCorrectAnswer().equals(precQuestion.getAnswer1().getAnswer())) {
                    score++;
                }
                ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar);
                progressBar.setProgress((counter-1)*33);

            }
            TextView tv = (TextView) findViewById(R.id.textView2);

            Button btn1 = (Button) findViewById(R.id.btnStart);
            Button btn2 = (Button) findViewById(R.id.btnAnswer1);
            Button btn3 = (Button) findViewById(R.id.btnAnswer2);

            tv.setText(question.getQuestion());
            btn1.setText(question.getAnswer1().getAnswer());
            btn2.setText(question.getAnswer2().getAnswer());
            btn2.setVisibility(View.VISIBLE);
            btn2.setVisibility(View.VISIBLE);
            btn3.setText(question.getAnswer3().getAnswer());
            btn3.setVisibility(View.VISIBLE);

        }
        else{
            if(counter>1){
                Question precQuestion = objQuestion.getQuestion(counter-1);

                if (precQuestion.getCorrectAnswer().equals(precQuestion.getAnswer1().getAnswer())) {
                    score++;
                }}
            Answers[] answers = new Answers[3];

            TextView tv = (TextView) findViewById(R.id.textView2);
            Button btn1 = (Button) findViewById(R.id.btnStart);
            Button btn2 = (Button) findViewById(R.id.btnAnswer1);
            Button btn3 = (Button) findViewById(R.id.btnAnswer2);
            btn1.setVisibility(View.INVISIBLE);
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            tv.setText("Congarts! \nyou get "+score+" of 3 in the test!");
            ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar);
            progressBar.setProgress((counter-1)*34);

        }

    }
    public void btnAnswer1OnClick(View view) {
        counter++;

        QuestionDa objQuestion = new QuestionDa();
        if(counter<4) {
            Question question = objQuestion.getQuestion(counter);
            Question precQuestion = objQuestion.getQuestion(counter-1);

            if (precQuestion.getCorrectAnswer().equals(precQuestion.getAnswer2().getAnswer())) {
                score++;
            }

            TextView tv = (TextView) findViewById(R.id.textView2);
            Button btn1 = (Button) findViewById(R.id.btnStart);
            Button btn2 = (Button) findViewById(R.id.btnAnswer1);
            Button btn3 = (Button) findViewById(R.id.btnAnswer2);
            ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar);
            progressBar.setProgress((counter-1)*33);


            tv.setText(question.getQuestion());
            btn1.setText(question.getAnswer1().getAnswer());
            btn2.setText(question.getAnswer2().getAnswer());
            btn2.setVisibility(View.VISIBLE);
            btn2.setVisibility(View.VISIBLE);
            btn3.setText(question.getAnswer3().getAnswer());
            btn3.setVisibility(View.VISIBLE);
        }
        else{
            Question precQuestion = objQuestion.getQuestion(counter-1);

            if (precQuestion.getCorrectAnswer().equals(precQuestion.getAnswer2().getAnswer())) {
                score++;
            }
            TextView tv = (TextView) findViewById(R.id.textView2);
            Button btn1 = (Button) findViewById(R.id.btnStart);
            Button btn2 = (Button) findViewById(R.id.btnAnswer1);
            Button btn3 = (Button) findViewById(R.id.btnAnswer2);
            btn1.setVisibility(View.INVISIBLE);
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            tv.setText("Congarts! \nyou get "+score+" of 3 in the test!");
            ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar);
            progressBar.setProgress((counter-1)*34);

        }
    }
    public void btnAnswer2OnClick(View view) {
        counter++;

        QuestionDa objQuestion = new QuestionDa();
        if(counter<4) {
            Question question = objQuestion.getQuestion(counter);

            Question precQuestion = objQuestion.getQuestion(counter-1);

            if (precQuestion.getCorrectAnswer().equals(precQuestion.getAnswer3().getAnswer())) {
                score++;
            }

            TextView tv = (TextView) findViewById(R.id.textView2);
            Button btn1 = (Button) findViewById(R.id.btnStart);
            Button btn2 = (Button) findViewById(R.id.btnAnswer1);
            Button btn3 = (Button) findViewById(R.id.btnAnswer2);
            ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar);
            progressBar.setProgress((counter-1)*33);


            tv.setText(question.getQuestion() );
            btn1.setText(question.getAnswer1().getAnswer());
            btn2.setText(question.getAnswer2().getAnswer());
            btn2.setVisibility(View.VISIBLE);
            btn2.setVisibility(View.VISIBLE);
            btn3.setText(question.getAnswer3().getAnswer());
            btn3.setVisibility(View.VISIBLE);
        }
        else{
            Question precQuestion = objQuestion.getQuestion(counter-1);

            if (precQuestion.getCorrectAnswer().equals(precQuestion.getAnswer3().getAnswer())) {
                score++;
            }

            TextView tv = (TextView) findViewById(R.id.textView2);
            Button btn1 = (Button) findViewById(R.id.btnStart);
            Button btn2 = (Button) findViewById(R.id.btnAnswer1);
            Button btn3 = (Button) findViewById(R.id.btnAnswer2);
            btn1.setVisibility(View.INVISIBLE);
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            tv.setText("Congarts! \nyou get "+score+" of 3 in the test!");
            ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar);
            progressBar.setProgress((counter-1)*34);

        }

    }

}