package com.ss.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBUtils {
    private static final String URL = "jdbc:mysql://localhost:3306/java_batch?serverTimezone=UTC";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "123456";

    public static Connection getDbConnection(){
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }
}
