package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.demo.entity.User;
import com.demo.service.UserService;


@Controller
public class UserController {

	@Autowired
	private UserService service;

	@GetMapping("/")
	public String loadForm(Model model) {
		model.addAttribute("user", new User());
		return "index";
	}

	@PostMapping("/user")
	public String handleSubmitBtn(User user, Model model) {

		System.out.println(user);
		boolean saveUser = service.saveUser(user);
		
		if(saveUser) {
			model.addAttribute("msg", "User Data Saved successfully...!!");
		}

				return "index";
	}


 @GetMapping("/users") 
 public String viewUsers(Model model) { 
	 
 List<User> allUsers = service.getAllUser();
 
 model.addAttribute("users", allUsers);
 
 return "view-users";
 
 }
 
 



}
