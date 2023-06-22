package com.customer;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;




public class customerUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id  = request.getParameter("cusid");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		String phone = request.getParameter("phone");
		String username = request.getParameter("uname");
		String password = request.getParameter("pass");
	
		
		boolean isTrue;
		
		isTrue = customerDButil.customerUpdate(id , name, email,address, phone, username, password);
		
		if(isTrue == true) {
			
			List<customer> cusDetails =customerDButil.getCustomerDetails(id );
			request.setAttribute("cusDetails", cusDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("customerAccount.jsp");
			dis.forward(request, response);
		}
		else {
			List<customer> cusDetails =customerDButil.getCustomerDetails(id );
			request.setAttribute("cusDetails", cusDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("customerAccount.jsp");
			dis.forward(request, response);
		}
	}

}
