package com.niloufar.khalilian.classes;

public class User {
	private String userName;
	private String password;
	private String role;
	private int id=0;
	
	User(String userName, String password, String role){
		this.userName= userName;
		this.password= password;
		this.role= role;
		
	}
	public void PrintInfo(){
		System.out.println("Name of the user: ");
		System.out.println(this.getUserName());
		System.out.println("Role of the user is: ");
		System.out.println(this.getRole());
	}

	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
