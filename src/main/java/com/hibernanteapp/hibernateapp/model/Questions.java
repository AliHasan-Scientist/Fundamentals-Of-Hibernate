package com.hibernanteapp.hibernateapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Questions {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "question_id")
    private int questionId;
    private String questsion;
    @OneToOne
    private Answer answer;

    public Questions(int questionId, String questsion, Answer answer) {
        this.questionId = questionId;
        this.questsion = questsion;
        this.answer = answer;
    }
    public Questions() {
        super();
    }
    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getQuestsion() {
        return questsion;
    }

    public void setQuestsion(String questsion) {
        this.questsion = questsion;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    

}
