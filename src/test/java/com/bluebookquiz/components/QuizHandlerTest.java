package com.bluebookquiz.components;

import com.bluebookquiz.entities.Question;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class QuizHandlerTest {
    private List<Question> questionsTest;

    @BeforeEach
    void setUp() {
        Question q1 = new Question("Quel est le mont le plus elevé du monde ?","Culture générale",2);
        Question q2 = new Question("Qui est didier Drogba ?","Football",3);
        questionsTest.add(q1);
        questionsTest.add(q2);
    }

    @Test
    public void createQuiz() {
        assertTrue(this.questionsTest.size() == 2);
        assertTrue(!questionsTest.isEmpty());
    }

    @AfterEach
    void tearDown() {
        questionsTest = null;
    }
}