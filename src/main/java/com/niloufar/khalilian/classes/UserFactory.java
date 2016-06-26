package com.niloufar.khalilian.classes;

public class UserFactory {
	public User createUser(String[] info){
		User user= new User(info);
		return user;	
	}
	public boolean userExist(String name){
		for (CheckingAccount checkingAccount: DB.db)
			if (checkingAccount.getUser().getUserName().equals(name))
				return true;
		return false;
		
	}

}
