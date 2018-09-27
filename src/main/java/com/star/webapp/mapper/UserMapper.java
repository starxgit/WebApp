package com.star.webapp.mapper;

import java.util.List;

import com.star.webapp.model.UserInfo;

public interface UserMapper {
    public List<UserInfo> getUsers();
    public UserInfo myUserInfo(int user_id);
    
}
