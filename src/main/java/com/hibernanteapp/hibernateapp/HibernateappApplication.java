package com.hibernanteapp.hibernateapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.hibernanteapp.hibernateapp.model.Answer;
import com.hibernanteapp.hibernateapp.model.Questions;
import com.hibernanteapp.hibernateapp.repositeries.AnswerRepositery;
import com.hibernanteapp.hibernateapp.repositeries.QuestionRepositery;

@AutoConfiguration
@SpringBootApplication
public class HibernateappApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(HibernateappApplication.class, args);
		QuestionRepositery questionRepositery = context.getBean(QuestionRepositery.class);
		AnswerRepositery answerRepositery = context.getBean(AnswerRepositery.class);
		Questions questions = new Questions();
		Answer answer = new Answer();
		questions.setQuestionId(101);
		questions.setQuestsion("What is Computer?");
		answer.setAnswer_id(201);
		answer.setAnswer("Computer in machine");
		questions.setAnswer(answer);
		questionRepositery.save(questions);
		// answerRepositery.save(answer);
	}

}
