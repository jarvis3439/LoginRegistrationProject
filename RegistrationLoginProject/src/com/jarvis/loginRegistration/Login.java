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
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Login() {
        super();
        
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CustomerDao customerDao = new CustomerDaoImplement();
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		Customer customer = customerDao.getCustomer(userName, password);
		
		if (customer != null && customer.getName() != null) {
			request.setAttribute("message", customer.getName());
			request.getRequestDispatcher("welcome.jsp").forward(request, response);
		} else {
			request.setAttribute("message", "Data not Found please kindly register first !!!");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		
	}

}
