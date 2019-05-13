package com.jarvis.loginRegistration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.sun.crypto.provider.RSACipher;

public class CustomerDaoImplement implements CustomerDao {
	
	static Connection con;
	static PreparedStatement ps;
	@Override
	public int insertCustomer(Customer c) {
		int status =0;
		try {
			con = MyConnectionProvider.getConnection();
			ps = con.prepareStatement("insert into customer values(?,?,?,?)");
			ps.setString(1, c.getUsername());
			ps.setString(2, c.getPassword());
			ps.setString(3, c.getName());
			ps.setString(4, c.getEmail());
			status = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}

	@Override
	public Customer getCustomer(String username, String password) {
		Customer customer = null;
		try {
			con = MyConnectionProvider.getConnection();
			ps = con.prepareStatement("select * from customer where userid=? and password=?");
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet resultSet = ps.executeQuery();
			
			while (resultSet.next()) {
				customer = new Customer();
				customer.setUsername(resultSet.getString(1));
				customer.setPassword(resultSet.getString(2));
				customer.setName(resultSet.getString(3));
				
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return customer;
	}

}
