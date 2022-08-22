package com.zheng.CustomerAndItemDAO;

public class Customer {
	private int id;
	private String email, fname, lname;
	
	public Customer() {}
	
	//Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", email=" + email + ", fname=" + fname + ", lname=" + lname + "]";
	}
	
	
}
