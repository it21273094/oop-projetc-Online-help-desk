package com.customer;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class loginservlet extends HttpServlet {
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
				request.setAttribute("cusDetails", cusDetails);
				
				RequestDispatcher dis =  request.getRequestDispatcher("customerAccount.jsp");
				dis.forward(request,response);
			} else {
				
				out.println("<script type='text/javascript'>");
				out.println("alert('Your username or password is incorrect');");
				out.println("location='login.jsp'");
				out.println("</script>");
			}

		}
		
		
		
		
		
		
		
		
	}


