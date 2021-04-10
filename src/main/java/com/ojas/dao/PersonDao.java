package com.ojas.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ojas.models.Person;

public interface PersonDao extends MongoRepository<Person, Integer> {

}
