package org.example.db_top;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    final static String URL = "jdbc:mysql://localhost:3306/top";
    final static String USERNAME = "root";
    final static String PASSWORD = "root";
    public Connection connection = null;
    public DBConnection(){
        try {
            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
