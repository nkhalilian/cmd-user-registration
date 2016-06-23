package com.niloufar.khalilian.classes;

import com.niloufar.khalilian.interfaces.ReadCommand;

public class ListReadCommand implements ReadCommand{

	public User readUser(int id) {
		for (User user : DB.db){
			if (user.getId()==id)
				return user;
		}
			
		// TODO Auto-generated method stub
		return null;
	}

}
