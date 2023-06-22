package com.company;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class companyDButil {
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
    
	public static boolean validate(String username, String password) {
		
		try {
			con = connectDB.getConnection();
			stmt = con.createStatement();
			String sql = "select * from company where username='"+username+"' and password='"+password+"'";
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
	
	
	    
	
public static List<company> getcompany(String userName) {
		
		ArrayList<company> Comp = new ArrayList<>();
		
		try {
			
			con = connectDB.getConnection();
			stmt = con.createStatement();
			String sql = "select * from company where username='"+userName+"'";
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				int comID = rs.getInt(1);
				String name = rs.getString(2);
				String website = rs.getString(3);
				String email = rs.getString(4);
				String address = rs.getString(5);
				String phone = rs.getString(6);
				String industry = rs.getString(7);
				String username = rs.getString(8);
				String password = rs.getString(9);
			
				
				company com = new company(comID,name,website,email,address,phone,industry,username,password);
				Comp.add(com);
			}
			
		} catch (Exception e) {
			
		}
		
		return Comp;	
	}

public static boolean insertcompany(String name,String website, String email,String address, String phone,String industry, String username, String password) {
	
	boolean isSuccess = false;
	
	try {
		con = connectDB.getConnection();
		stmt = con.createStatement();
	    String sql = "insert into company values (0,'"+name+"','"+website+"','"+email+"','"+address+"','"+phone+"','"+industry+"','"+username+"','"+password+"')";
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

public static boolean companyUpdate(String id, String name,String website, String email,String address, String phone,String industry, String username, String password) {
	
	try {
		
		con = connectDB.getConnection();
		stmt = con.createStatement();
		String sql = "update company set name='"+name+"',website='"+website+"',email='"+email+"',address='"+address+"',phone='"+phone+"',industry='"+industry+"',username='"+username+"',password='"+password+"'"
				+ "where comID='"+id+"'";
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

public static List<company> getCompanyDetails(String comID) {
	
	int convertedID = Integer.parseInt(comID);
	
	ArrayList<company> com = new ArrayList<>();
	
	try {
		
		con = connectDB.getConnection();
		stmt = con.createStatement();
		String sql = "select * from company where comID='"+convertedID+"'";
		rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			
			int id = rs.getInt(1);
			String name = rs.getString(2);
			String website = rs.getString(3);
			String email = rs.getString(4);
			String address = rs.getString(5);
			String phone = rs.getString(6);
			String industry = rs.getString(7);
			String username = rs.getString(8);
			String password = rs.getString(9);
			
			company c1 = new company(id ,name,website,email,address,phone,industry,username,password);
			com.add(c1);
		}
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}	
	return com;	
}


public static boolean deleteCompany(String comID) {
	
	int convId = Integer.parseInt(comID);
	
	try {
		
		con = connectDB.getConnection();
		stmt = con.createStatement();
		String sql = "delete from company where comID='"+convId+"'";
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
