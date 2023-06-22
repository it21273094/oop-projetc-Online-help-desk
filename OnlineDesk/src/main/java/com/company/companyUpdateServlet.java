package com.company;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;



public class companyUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		String id  = request.getParameter("comid");
		String name = request.getParameter("name");
		String website = request.getParameter("website");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		String phone = request.getParameter("phone");
		String industry = request.getParameter("industry");
		String username = request.getParameter("uname");
		String password = request.getParameter("pass");
	
		
		boolean isTrue;
		
		isTrue = companyDButil.companyUpdate(id ,name,website,email,address, phone,industry,username,password);
		
		if(isTrue == true) {
			
			List<company> comDetails =companyDButil.getCompanyDetails(id );
			request.setAttribute("comDetails", comDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("companyAccount.jsp");
			dis.forward(request, response);
		}
		else {
			List<company> comDetails =companyDButil.getCompanyDetails(id );
			request.setAttribute("comDetails", comDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("companyAccount.jsp");
			dis.forward(request, response);
		}
		
		
	}

}
