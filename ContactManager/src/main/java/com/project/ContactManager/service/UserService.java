package com.project.ContactManager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.ContactManager.dao.UserRepository;
import com.project.ContactManager.model.User;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	public User findUser(String email)
	{
		User user=userRepository.findByEmail(email);
		return user;
	}
	
	public User addUser(User user)
	{
		user=userRepository.save(user);
		return user;
	}
}
