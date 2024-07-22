package com.fullstack.userCrud.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fullstack.userCrud.Exception.UserNotFoundException;
import com.fullstack.userCrud.Model.User;
import com.fullstack.userCrud.UserRepository.UserRepository;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserRepository repo;

	@Override
	public List<User> getAllUser() {
		
		return repo.findAll();
	}

	@Override
	public User getOneUserById(long id) {
		repo.findById(id).orElseThrow(()-> new UserNotFoundException(id));
		return repo.findById(id).get();
	}

	@Override
	public User addOneUser(User user) {
		
		return repo.save(user);
	}

	@Override
	public User deleteOneUserById(long id) {
		if(!repo.existsById(id))throw new UserNotFoundException(id);
		User user1=repo.findById(id).get();
		repo.deleteById(id);
		return user1;
	}

	@Override
	public User updateOneUser(User user, long id) {
		return repo.findById(id)
				.map(users ->{
					users.setUserName(user.getUserName());
					users.setName(user.getName());
					users.setEmail(user.getEmail());
					return repo.save(users);
					}).orElseThrow(() -> new UserNotFoundException(id));
					
	}

}
