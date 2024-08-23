package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.User;
import com.demo.repo.UserRepo;

@Service
public class UserService {
	
	@Autowired
	private UserRepo userRepo;
	
	//insert Data
	
	public boolean saveUser(User user) {
		user = userRepo.save(user);
		
		return user.getUserId() >0;
	}
	//retrieve data
	
	public List<User> getAllUser(){
		return userRepo.findAll();
	}
	
	

	public void deleteUser(Integer userId) {
		userRepo.deleteById(userId);
		
	}

}
