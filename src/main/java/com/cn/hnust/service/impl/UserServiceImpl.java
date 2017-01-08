package com.cn.hnust.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.hnust.dao.UserMapper;
import com.cn.hnust.pojo.User;
import com.cn.hnust.service.IUserService;

@Service("userService")  
public class UserServiceImpl implements IUserService {  
    @Resource  
    private UserMapper userMapper;  
    @Override  
    public User getUserById(int userId) {  
        // TODO Auto-generated method stub  
        return this.userMapper.selectByPrimaryKey(userId); 
    	
    }
	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return this.userMapper.getAll();
	}
	@Override
	public void updateUserById(User user) {
		// TODO Auto-generated method stub
		 this.userMapper.updateByPrimaryKey(user);
	}
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		 this.userMapper.insert(user);
	}
	@Override
	public void deleteUserById(int id) {
		// TODO Auto-generated method stub
		this.userMapper.deleteByPrimaryKey(id);
	}  
  
}  