package com.insurance.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.insurance.entity.User;
import com.insurance.repository.UserRepository;
import com.insurance.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User saveUser(User user) {
		User userDetails=userRepository.save(user);
		return userDetails;
	}

	@Override
	public User getuser(Integer id) {
		User getuserDetails=userRepository.findById(id).get();
		return getuserDetails;
	}

	@Override
	public User deleteUser(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
