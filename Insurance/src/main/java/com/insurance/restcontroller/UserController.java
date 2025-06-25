package com.insurance.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.entity.User;
import com.insurance.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/saveUser")
	public User saveUser(@RequestBody User user) {
		User userData=userService.saveUser(user);
		return userData;
	}
	
	@GetMapping("/getUser/{id}")
	public User getUser(@PathVariable("id") Integer id) {
		User userData=userService.getuser(id);
		return userData;
	}
}
