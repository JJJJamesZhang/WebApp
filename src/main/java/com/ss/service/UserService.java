package com.ss.service;

import com.ss.dao.UserDao;
import com.ss.entity.User;

public class UserService {
    public boolean isValidUser(String username, String password){
        User user = new UserDao().getUserByUsernameAndPassword(username,password);
        if (user.getPassword() != null && user.getPassword() != null){
            return  true;
        }else {
            return false;
        }
    }
}
