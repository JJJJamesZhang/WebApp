package com.ss.dao;

import com.ss.entity.User;
import com.ss.utils.DBUtils;
import org.springframework.stereotype.Component;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class UserDao {


    public User getUserByUsernameAndPassword(String username, String password){
        Connection connection= DBUtils.getDbConnection();
        String sql = "select * from User where username = ? and password = ?";
        User user = new User();
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, username);
            statement.setString(2,password);
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }
}
