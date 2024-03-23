package com.bluebookquiz.interfaces;

import com.bluebookquiz.entities.Question;

import java.util.List;

public interface Quiz {

    void createQuiz(List<Question> questions);

    void playQuiz();
}
