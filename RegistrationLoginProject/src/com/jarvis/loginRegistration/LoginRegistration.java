package com.jarvis.loginRegistration;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginRegistration
 */
@WebServlet("/LoginRegistration")
public class LoginRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginRegistration() {
        super();
        
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CustomerDao customerDao = new CustomerDaoImplement();
		String userName = request.getParameter("username");
		String password = request.getParameter("password1");
		Customer customer = customerDao.getCustomer(userName, password);
		
		if(customer == null)
		{
			customer = new Customer();
			customer.setName(request.getParameter("name"));
			customer.setEmail(request.getParameter("email"));
			customer.setPassword(password);
			customer.setUsername(userName);
			customerDao.insertCustomer(customer);
			request.setAttribute("successMessage", "Registration Done please login to continue !!!");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		} else {
			request.setAttribute("message", "User alredy exists please try with other username !!!");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		
		
	}

}
