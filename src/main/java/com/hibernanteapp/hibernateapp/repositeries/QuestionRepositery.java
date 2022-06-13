package com.hibernanteapp.hibernateapp.repositeries;

import org.springframework.data.repository.CrudRepository;

import com.hibernanteapp.hibernateapp.model.Questions;

public interface QuestionRepositery extends CrudRepository<Questions, Integer> {

}
