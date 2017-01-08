package com.cn.hnust.service;

import java.util.List;

import com.cn.hnust.pojo.User;

public interface IUserService {
	
	 public User getUserById(int userId);  
	 
	 public List<User> getAll();
	 
	 public void updateUserById(User user);
	 public void addUser(User user);
	 public void deleteUserById(int id);
}
