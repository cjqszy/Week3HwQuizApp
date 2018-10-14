package com.example.cln62.week3hwquizapp.main;

import com.example.cln62.week3hwquizapp.data.TodoNote;

public interface MainContract {
    
    interface View{
        public void showQuesAndAns(TodoNote todonote);

        void positionIncreaseComfirm();

        void positionDecreaseComfirm();
    };
    
    interface Presenter{
        void getQuesAndAns(int cursorPosition);

        void initializer();

        void positionIncrease();

        void positionDecrease();
    };
}
