package com.example.javaseeker;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecontroller {
	
	@Autowired
	UserRepository userRepository;
	
	@DeleteMapping("users")
	public String deleteUser(@RequestBody User user) {
	 userRepository.delete(user);
	 return "user deleted";
	}
	
	@PutMapping("users")
	public User updateUser(@RequestBody User user) {
	return userRepository.save(user);
	}
	
	
	@PostMapping("users")
	public User saveUser(@RequestBody User user) {
	return userRepository.save(user);
	}
	
	@GetMapping("myname")
	public String MyName(String name) {
	return name.toUpperCase();
	}
	
	@GetMapping("users")
	public List<User> User() {
	return userRepository.findAll();
	}
	
}
