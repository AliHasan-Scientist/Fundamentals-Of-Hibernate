package com.hibernanteapp.hibernateapp.repositeries;


import org.springframework.data.repository.CrudRepository;

import com.hibernanteapp.hibernateapp.model.User;

public interface UserRepositery extends CrudRepository<User, Integer> {

}
