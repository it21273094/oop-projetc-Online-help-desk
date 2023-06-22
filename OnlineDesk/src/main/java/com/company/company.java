package com.company;

public class company {

	private int comID;
    private String name;
    private String website;
    private String email;
    private String address;
    private String phone;
    private String industry;
    private String userName;
    private String password;
    
    
	public company(int comID, String name, String website, String email, String address, String phone, String industry,
			String userName, String password) {
	
		this.comID = comID;
		this.name = name;
		this.website = website;
		this.email = email;
		this.address = address;
		this.phone = phone;
		this.industry = industry;
		this.userName = userName;
		this.password = password;
	}


	public int getcomID() {
		return comID;
	}


	public String getname() {
		return name;
	}

	public String getwebsite() {
		return website;
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


	public String getindustry() {
		return industry;
	}


	public String getusername() {
		return userName;
	}


	public String getpassword() {
		return password;
	}


	
  
	
	
	
}
