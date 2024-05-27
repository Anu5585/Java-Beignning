package com.example.userdaoexample.util;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;




public class DbUtil {
	private static Connection connection = null;// 1 connection for the whole app
	
	public static Connection getConnection() {
	      if (connection != null)
	            return connection;
	        else {
	        	 try {
	                
	                 String driver = "com.mysql.cj.jdbc.Driver";
	                 String url = "jdbc:mysql://localhost:3306/book";
	                 String user = "root";
	                 String password = "Zubair!123";
	                 Class.forName(driver);
	                 connection = DriverManager.getConnection(url, user, password);
	             } catch (ClassNotFoundException e) {
	                 e.printStackTrace();
	             } catch (SQLException e) {
	                 e.printStackTrace();
	             }
	             return connection;
	        }
	}
	
	

}
