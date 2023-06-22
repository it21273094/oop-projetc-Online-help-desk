package com.company;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;




public class CompanyInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			String name = request.getParameter("name");
			String website = request.getParameter("website");
			String email = request.getParameter("email");
			String address = request.getParameter("address");
			String phone = request.getParameter("phone");
			String industry= request.getParameter("industry");
			String username = request.getParameter("uid");
			String password = request.getParameter("psw");
			
			
			boolean isTrue;
			
			isTrue = companyDButil.insertcompany(name,website, email,address, phone,industry, username, password);
			
			if(isTrue == true) {
				RequestDispatcher dis =  request.getRequestDispatcher("logincom.jsp");
				dis.forward(request, response);
			} else {
				RequestDispatcher dis2 =  request.getRequestDispatcher("unsuccess.jsp");
				dis2.forward(request, response);
			}
			
	}

}
