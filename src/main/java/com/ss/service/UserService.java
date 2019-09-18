package com.ss.service;

import com.ss.dao.UserDao;
import com.ss.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    @Autowired
    private UserDao userDao;
    public boolean isValidUser(String username, String password){
        User user = userDao.getUserByUsernameAndPassword(username,password);
        if (user.getPassword() != null && user.getPassword() != null){
            return  true;
        }else {
            return false;
        }
    }
}
