package com.blair.rentool.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blair.rentool.models.Tool;

//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class MainController {
	
	
//	@PostMapping("/register")
//    public User registerUser(@RequestBody User user) {
//		System.out.println(user.getPassword());
//		User newUser = uService.registerUser(user);
//		return newUser;
//    }
//	
//	@PostMapping("/login")
//    public User loginUser(@RequestBody User user) {
//    	if (uService.authenticateUser(user.getEmail(), user.getPassword())) {
//    		return uService.findByEmail(user.getEmail());
//    	} else {
//    		return null;
//    	}
//    }
	
	@GetMapping("/tools")
	public List<Tool> getTools() {
		return null;
	}
	
	@GetMapping("/tools/{id}")
	public Tool getTool(@PathVariable("id") Long id) {
		return null;
	}
	
	@PostMapping("/tools/{user_id}")
	public void createTool(@RequestBody Tool tool, @PathVariable("user_id") Long id) {
//		return null;
	}
	
	@DeleteMapping("/tools/{id}")
	public void deleteTool(@PathVariable("id") Long id) {
		
	}
	
	
}
