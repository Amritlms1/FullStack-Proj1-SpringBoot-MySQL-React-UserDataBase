package com.fullstack.userCrud.UserService;

import java.util.List;

import com.fullstack.userCrud.Model.User;

public interface UserService {
public List<User> getAllUser();
public User getOneUserById(long id);
public User addOneUser(User user);
public User deleteOneUserById(long id);
public User updateOneUser(User user,long id);
}
