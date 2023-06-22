package com.customer;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;


public class cuslogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
	     response.setContentType("text/html");
	     String userName = request.getParameter("username");
			String password = request.getParameter("password");  
	     
	     boolean isTrue;
	     isTrue = customerDButil.validate(userName, password);
	     
	     if (isTrue == true) {
				List<customer> cusDetails = customerDButil.getcustomer(userName);
				request.removeAttribute("cusDetails");
	     RequestDispatcher dis =  request.getRequestDispatcher("login.jsp");
	     dis.forward(request, response);
	} else {	
	     out.println("<script type='text/javascript'>");
			out.println("alert('You are successfully logout');");
			out.println("location='login.jsp'");
			out.println("</script>");
		
		
		
	}

}
}
