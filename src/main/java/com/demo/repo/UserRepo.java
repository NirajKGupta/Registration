package com.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
