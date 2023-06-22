package com.customer;

public class customer {
	
	private int cusID;
    private String name;
    private String email;
    private String address;
    private String phone;
    private String userName;
    private String password;

    
	public customer(int cusID, String name, String email, String address, String phone, String userName,
			String password) {
		
		this.cusID = cusID;
		this.name = name;
		this.email = email;
		this.address = address;
		this.phone = phone;
		this.userName = userName;
		this.password = password;
		
	}

	public int getcusID() {
		return cusID;
	}

	public String getname() {
		return name;
	}

	public String getemail() {
		return email;
	}

	public String getaddress() {
		return address;
	}

	public String getphone() {
		return phone;
	}

	public String getusername() {
		return userName;
	}

	public String getpassword() {
		return password;
	}
	
	
    

}
