package com.star.webapp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.star.webapp.mapper.UserMapper;
import com.star.webapp.model.UserInfo;

@Repository
public class UserDao implements UserMapper{
    @Autowired
    private UserMapper userMapper;
    
    @Override
    public List<UserInfo> getUsers() {
        return userMapper.getUsers();
    }

    @Override
    public UserInfo myUserInfo(int user_id) {
        return userMapper.myUserInfo(user_id);
    }

}
