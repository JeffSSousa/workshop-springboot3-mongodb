package com.jeffersonsilva.workshop_mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.jeffersonsilva.workshop_mongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
