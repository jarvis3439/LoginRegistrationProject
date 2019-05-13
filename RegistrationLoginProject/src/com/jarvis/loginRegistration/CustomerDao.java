package com.jarvis.loginRegistration;

public interface CustomerDao {
	
	public int insertCustomer(Customer c);
	public Customer getCustomer(String usernname, String password);
	
}
