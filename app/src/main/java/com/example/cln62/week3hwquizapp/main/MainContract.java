package com.example.cln62.week3hwquizapp.main;

import com.example.cln62.week3hwquizapp.data.TodoNote;

public interface MainContract {
    
    interface View{
        public void showQuesAndAns(TodoNote todonote);
    };
    
    interface Presenter{
        void getQuesAndAns();

        void Initializer();

        void move2NewRecord();
    };
}
