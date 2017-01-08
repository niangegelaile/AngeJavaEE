package com.cn.hnust.dao;

import java.util.List;

import com.cn.hnust.pojo.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    List<User> getAll();
    
    
    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}