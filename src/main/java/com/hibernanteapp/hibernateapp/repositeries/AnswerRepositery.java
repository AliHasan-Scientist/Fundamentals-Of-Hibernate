package com.hibernanteapp.hibernateapp.repositeries;

import org.springframework.data.repository.CrudRepository;

import com.hibernanteapp.hibernateapp.model.Answer;

public interface AnswerRepositery extends CrudRepository<Answer,Integer> {
    
}
