package com.restfulapi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.restfulapi.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
