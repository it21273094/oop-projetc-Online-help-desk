package com.company;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;



public class companyDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("comid");
		boolean isTrue;
		
		isTrue = companyDButil.deleteCompany(id);
		
		if (isTrue == true) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
			dispatcher.forward(request, response);
		}
		else {
			
			List<company> comDetails = companyDButil.getCompanyDetails(id);
			request.setAttribute("comDetails", comDetails);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("companyAccount.jsp");
			dispatcher.forward(request, response);
		}
		
		
	}

}
