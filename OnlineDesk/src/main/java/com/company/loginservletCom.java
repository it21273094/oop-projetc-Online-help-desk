package com.company;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;




public class loginservletCom extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 PrintWriter out = response.getWriter();
	     response.setContentType("text/html");
		
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
        boolean isTrue;
		
		isTrue = companyDButil.validate(userName, password);
		
		if (isTrue == true) {
			List<company> comDetails = companyDButil.getcompany(userName);
			request.setAttribute("comDetails", comDetails);
			
			RequestDispatcher dis =  request.getRequestDispatcher("companyAccount.jsp");
			dis.forward(request,response);
		} else {
			
			out.println("<script type='text/javascript'>");
			out.println("alert('Your username or password is incorrect');");
			out.println("location='logincom.jsp'");
			out.println("</script>");
		}

	}
}