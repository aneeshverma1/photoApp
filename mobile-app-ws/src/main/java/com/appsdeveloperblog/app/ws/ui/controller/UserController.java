package com.appsdeveloperblog.app.ws.ui.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {
	@GetMapping(path = "/{userId}")
	public String getUser(@PathVariable String a) {
		return "User returned "+ a;
	}
	
	@PostMapping
	public String createUser()
	{
		return "user created";
	}
	@PutMapping
	public String updateUser()
	{
		return "user updated";
	}
	
	@DeleteMapping
	public String deleteUser()
	{
		return "user deleted";
	}
}
