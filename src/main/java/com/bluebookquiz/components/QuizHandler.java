package com.bluebookquiz.components;

import com.bluebookquiz.entities.Question;
import com.bluebookquiz.interfaces.Quiz;

import java.util.List;

public class QuizHandler implements Quiz {

    private List<Question> questions;

    @Override
    public void createQuiz(List<Question> questions) {
        this.questions = questions;
    }

    @Override
    public void playQuiz() {

    }
}
