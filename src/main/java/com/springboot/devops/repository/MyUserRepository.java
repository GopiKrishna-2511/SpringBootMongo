package com.springboot.devops.repository;

import com.springboot.devops.entity.MyUser;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;


public interface MyUserRepository extends MongoRepository<MyUser, String> {

    Optional<MyUser> findByUsername(String username);
}
