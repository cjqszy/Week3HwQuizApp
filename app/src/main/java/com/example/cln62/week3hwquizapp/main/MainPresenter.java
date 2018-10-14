package com.example.cln62.week3hwquizapp.main;

import com.example.cln62.week3hwquizapp.data.TodoNote;
import com.example.cln62.week3hwquizapp.data.source.TodoDataSource;
import com.example.cln62.week3hwquizapp.data.source.TodoRepository;

public class MainPresenter implements MainContract.Presenter, TodoDataSource.TodoNoteCallBack {

    MainContract.View view;
    TodoDataSource todoRepository;

    public MainPresenter(MainActivity mainActivity) {
        view = mainActivity;
        todoRepository = new TodoRepository(mainActivity);
    }

    @Override
    public void getQuesAndAns(int cursorPosition) {
        todoRepository.getQuesAndAnsFromDB(this, cursorPosition);
    }

    @Override
    public void initializer() {
        todoRepository.dbInitializer();
    }

    @Override
    public void positionIncrease() {
        view.positionIncreaseComfirm();
    }

    @Override
    public void positionDecrease() {
        view.positionDecreaseComfirm();
    }

    @Override
    public void showQuesAndAns(TodoNote todonote) {
        view.showQuesAndAns(todonote);
    }
}
