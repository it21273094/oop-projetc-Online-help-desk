package com.customer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class customerDButil {
	
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
    
	public static boolean validate(String username, String password) {
		
		try {
			con = connectDB.getConnection();
			stmt = con.createStatement();
			String sql = "select * from customer where username='"+username+"' and password='"+password+"'";
			rs = stmt.executeQuery(sql);
			
			if (rs.next()) {
				isSuccess = true;
			} else {
				isSuccess = false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	
	    
	
public static List<customer> getcustomer(String userName) {
		
		ArrayList<customer> Cust = new ArrayList<>();
		
		try {
			
			con = connectDB.getConnection();
			stmt = con.createStatement();
			String sql = "select * from customer where username='"+userName+"'";
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				int cusID = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				String address = rs.getString(4);
				String phone = rs.getString(5);
				String username = rs.getString(6);
				String password = rs.getString(7);
			
				
				customer cus = new customer(cusID,name,email,address,phone,username,password);
				Cust.add(cus);
			}
			
		} catch (Exception e) {
			
		}
		
		return Cust;	
	}

public static boolean insertcustomer(String name, String email,String address, String phone, String username, String password) {
	
	boolean isSuccess = false;
	
	try {
		con = connectDB.getConnection();
		stmt = con.createStatement();
	    String sql = "insert into customer values (0,'"+name+"','"+email+"','"+address+"','"+phone+"','"+username+"','"+password+"')";
		int rs = stmt.executeUpdate(sql);
		
		if(rs > 0) {
			isSuccess = true;
		} else {
			isSuccess = false;
		}
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	
	return isSuccess;
}

public static boolean customerUpdate(String id, String name, String email,String address, String phone, String username, String password) {
	
	try {
		
		con = connectDB.getConnection();
		stmt = con.createStatement();
		String sql = "update customer set name='"+name+"',email='"+email+"',address='"+address+"',phone='"+phone+"',username='"+username+"',password='"+password+"'"
				+ "where cusID='"+id+"'";
		int rs = stmt.executeUpdate(sql);
		
		if(rs > 0) {
			isSuccess = true;
		}
		else {
			isSuccess = false;
		}
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	return isSuccess;
}

public static List<customer> getCustomerDetails(String cusID) {
	
	int convertedID = Integer.parseInt(cusID);
	
	ArrayList<customer> cus = new ArrayList<>();
	
	try {
		
		con = connectDB.getConnection();
		stmt = con.createStatement();
		String sql = "select * from customer where cusID='"+convertedID+"'";
		rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			String email = rs.getString(3);
			String address = rs.getString(4);
			String phone = rs.getString(5);
			String username = rs.getString(6);
			String password = rs.getString(7);
			
			
			customer c = new customer(id ,name,email,address,phone,username,password);
			cus.add(c);
		}
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}	
	return cus;	
}


public static boolean deleteCustomer(String cusID) {
	
	int convId = Integer.parseInt(cusID);
	
	try {
		
		con = connectDB.getConnection();
		stmt = con.createStatement();
		String sql = "delete from customer where cusID='"+convId+"'";
		int r = stmt.executeUpdate(sql);
		
		if (r > 0) {
			isSuccess = true;
		}
		else {
			isSuccess = false;
		}
		
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	
	return isSuccess;
}








	

	

}
