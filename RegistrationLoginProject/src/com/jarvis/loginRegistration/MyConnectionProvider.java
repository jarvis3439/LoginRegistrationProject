package com.jarvis.loginRegistration;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnectionProvider implements MyConnection {

	 
	
	public static Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(connectionUrl, username, password);
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return connection;
	}
}
