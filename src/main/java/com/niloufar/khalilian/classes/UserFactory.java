package com.niloufar.khalilian.classes;

public class UserFactory {
	public User createUser(String name, String password, String role){
		User user= new User(name, password, role);
		return user;	
	}
	public boolean userExist(){
		return false;
		
	}

}
