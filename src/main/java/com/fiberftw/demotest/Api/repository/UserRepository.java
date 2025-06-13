package com.fiberftw.demotest.Api.repository;

import com.fiberftw.demotest.Api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
