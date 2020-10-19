package com.blair.rentool.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.blair.rentool.models.Tool;
import com.blair.rentool.models.User;
import com.blair.rentool.services.ToolService;
import com.blair.rentool.services.UserService;

//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class MainController {
	@Autowired
	private UserService uService;
	@Autowired
	private ToolService tService;
	
//	{
//	name,
//	email,
//	password,
//	zip,
//	state
//}
	@PostMapping("/register")
    public User registerUser(@RequestBody User user) {
		System.out.println(user.getPassword());
		User newUser = uService.registerUser(user);
		return newUser;
    }
	
//	{
//		email,
//		password
//	}
	@PostMapping("/login")
    public User loginUser(@RequestBody User user) {
    	if (uService.authenticateUser(user.getEmail(), user.getPassword())) {
    		return uService.findByEmail(user.getEmail());
    	} else {
    		return null;
    	}
    }
	
	@GetMapping("/tools")
	public List<Tool> getTools() {
		return tService.findAllTools();
	}
	
	@GetMapping("/tools/page/{pageNumber}")
	public List<Tool> getToolsByPage(@PathVariable("pageNumber") Long pageNumber) {
		
		return null;
	}
	
	@GetMapping("/tools/{tool_id}")
	public Tool getTool(@PathVariable("tool_id") Long id) {
		return tService.findToolById(id);
	}
	
//	{
//		name,
//		price,
//		image,
//		description
//	}
	@PostMapping("/tools/{user_id}")
	public Tool createTool(@RequestBody Tool tool, @PathVariable("user_id") Long id) {
		tool.setUser(uService.findUserById(id));
		return tService.createTool(tool);
	}
	
	@DeleteMapping("/tools/{id}")
	public String deleteTool(@PathVariable("id") Long id) {
		tService.deleteTool(id);
		return "Successfully deleted";
	}
	
	@GetMapping("/tools/find/{searchName}")
	public List<Tool> searchTools(@PathVariable("searchName") String searchName) {
		return tService.searchTool(searchName);
	}
	
}
