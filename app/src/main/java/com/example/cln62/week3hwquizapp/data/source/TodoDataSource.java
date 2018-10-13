package com.example.cln62.week3hwquizapp.data.source;

import com.example.cln62.week3hwquizapp.data.TodoNote;
import com.example.cln62.week3hwquizapp.main.MainPresenter;

public interface TodoDataSource {
    void dbInitializer();

    void getQuesAndAnsFromDB(TodoNoteCallBack callBack);

    void getPrevQuesAndAnsFromDB(TodoNoteCallBack callBack);

    interface TodoNoteCallBack{
        public void showQuesAndAns(TodoNote todonote);
    };
}
