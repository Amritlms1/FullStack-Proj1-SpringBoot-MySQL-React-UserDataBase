package com.fullstack.userCrud.userController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fullstack.userCrud.Model.User;
import com.fullstack.userCrud.UserService.UserService;

@RestController
@CrossOrigin("http://localhost:3000")
public class Controller {
	@Autowired
	private UserService service;
	@GetMapping("/users")
	public List<User> getAllUser()
	{
		return service.getAllUser();
	}
	@GetMapping("/user/{id}")
	public User getAllUser(@PathVariable long id)
	{
		return service.getOneUserById(id);
	}
	@PostMapping("/user")
	public User addOneUser(@RequestBody User user)
	{
		return service.addOneUser(user);
	}
	@DeleteMapping("/user/{id}")
	public User deleteOneUser(@PathVariable long id)
	{
		return service.deleteOneUserById(id);
	}
	@PutMapping("/user/{id}")
	public User updateOneUser(@RequestBody User user,@PathVariable long id)
	{
		return service.updateOneUser(user, id);
	}
}
