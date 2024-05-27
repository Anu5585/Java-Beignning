package com.example.userdaoexample.dao;
import com.example.userdaoexample.dto.User;
import com.example.userdaoexample.util.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;





//Purpose: DAO
// It shields/houses all the Queries inside different methods
// Reusablity of methods

// Each DAO class corresponds to a table in database
// it will have all the queries needed to perform CRUD operations on this table

// Spring Data JPA--- DAO Auto generate
// Spring Data JPA ---- Named Query

// Runtime Byte Code generation
public class UserDAO {
    private Connection connection;
    public UserDAO(Connection connection) {
        this.connection = DbUtil.getConnection();
        System.out.println(connection);
    }
    public List<User> getAllUsers() {
        return null;
    }
    public void updateUser(User user) {
    }
    public void deleteUser(int id) {
    }
    public void addUser(User user) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into users(username,password) values (?, ?, ?, ? )");
            // Parameters start with 1
            preparedStatement.setString(1, user.getUsername());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public boolean validUser(String username,String password) {
        boolean flag = false;
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM user WHERE username='" + username+"' and password='"+password+"'");

            if(rs.next()){
                flag = true;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return flag;
    }
}
