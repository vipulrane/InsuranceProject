package com.insurance.service;

import org.springframework.stereotype.Service;

import com.insurance.entity.User;

@Service
public interface UserService {
	
	public User saveUser (User user);
	
	public User getuser (Integer id);
	
	public User deleteUser (Integer id);

}
