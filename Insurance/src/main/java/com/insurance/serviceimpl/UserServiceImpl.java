package com.insurance.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
	public void deleteUser(Integer id) {
		userRepository.deleteById(id);

	}

}
