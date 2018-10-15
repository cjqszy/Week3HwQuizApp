package com.example.cln62.week3hwquizapp.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import com.example.cln62.week3hwquizapp.R;
import com.example.cln62.week3hwquizapp.data.TodoNote;

public class MainActivity extends AppCompatActivity implements MainContract.View{

    TextView question;
    CheckBox checkBox1, checkBox2, checkBox3, checkBox4;
    MainPresenter mainPresenter;
    public int cursorPosition = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainPresenter = new MainPresenter(this);
        mainPresenter.initializer();

        question = findViewById(R.id.questionTextView);
        checkBox1 = findViewById(R.id.checkBox);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        checkBox4 = findViewById(R.id.checkBox4);

        mainPresenter.getQuesAndAns(cursorPosition);

    }

    @Override
    public void showQuesAndAns(TodoNote todonote) {
        question.setText(todonote.getQuestion());
        checkBox1.setText(todonote.getAnswer1());
        checkBox2.setText(todonote.getAnswer2());
        checkBox3.setText(todonote.getAnswer3());
        checkBox4.setText(todonote.getAnswer4());
    }

    @Override
    public void positionIncreaseComfirm() {
        cursorPosition++;
    }

    @Override
    public void positionDecreaseComfirm() {
        if (cursorPosition == 0) {
            return;
        }
        cursorPosition--;
    }

    public void buttonListener(View view) {
        switch (view.getId()) {
            case R.id.nextButton:
                mainPresenter.positionIncrease();
                mainPresenter.getQuesAndAns(cursorPosition);
                break;
            case R.id.prevButton:
                mainPresenter.positionDecrease();
                mainPresenter.getQuesAndAns(cursorPosition );
                break;
        }
    }
}
