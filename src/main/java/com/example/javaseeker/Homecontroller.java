package com.example.javaseeker;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecontroller {
	
	@Autowired
	UserRepository userRepository;
	
	@GetMapping("myname")
	public String MyName(String name) {
	return name.toUpperCase();
	}
	
	@GetMapping("users")
	public List<User> User() {
	return userRepository.findAll();
	}
	
}
