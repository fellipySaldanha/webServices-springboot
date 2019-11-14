package com.fellipy.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fellipy.course.entities.User;
import com.fellipy.course.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAllUsers() {
		return userRepository.findAll();
	}
		
	public User findById(Long id) {
		Optional<User> user = userRepository.findById(id);
		return user.get();
	}
}
