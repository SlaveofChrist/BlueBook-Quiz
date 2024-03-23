package com.bluebookquiz.entities;

import java.util.ArrayList;
import java.util.List;

public class Question {
    private String subject;
    private String theme;
    private List<Answer> answers ;
    private int point;

    public Question(String subject, String theme, int point) {
        this.subject = subject;
        this.theme = theme;
        this.point = point;
        this.answers = new ArrayList<>();
    }

    void addAnswer(Answer answer){
        this.answers.add(answer);
    }
}
