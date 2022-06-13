package com.hibernanteapp.hibernateapp.repositeries;

import org.springframework.data.repository.CrudRepository;

import com.hibernanteapp.hibernateapp.model.Student;

public interface StudentRepistery extends CrudRepository<Student,Integer> {
    
}
