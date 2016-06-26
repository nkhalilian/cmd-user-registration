package com.niloufar.khalilian.classes;

public class User {
	private String userName;
	private String password;
	private String role;
	private int id=0;


	
	User(String[] info){
		
		this.userName= info[0];
		this.password= info[1];
		this.role= info[2];
		
	}
	public void PrintInfo(){
		System.out.println("Name of the user: ");
		System.out.println(this.getUserName());
		System.out.println("Role of the user is: ");
		System.out.println(this.getRole());
	}
	public void EqualUser(User user){
		this.userName= user.userName;
		this.password= user.password;
		this.role= user.role;
	
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
