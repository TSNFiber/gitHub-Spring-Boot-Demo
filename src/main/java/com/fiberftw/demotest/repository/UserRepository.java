package com.fiberftw.demotest.repository;

import com.fiberftw.demotest.Api.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
