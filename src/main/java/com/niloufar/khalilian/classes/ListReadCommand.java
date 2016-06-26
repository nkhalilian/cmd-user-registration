package com.niloufar.khalilian.classes;

import com.niloufar.khalilian.interfaces.ReadCommand;

public class ListReadCommand implements ReadCommand{

	public CheckingAccount readUser(int id) {
		for ( CheckingAccount checkingAccount : DB.db){
			if (checkingAccount.getUser().getId()==id)
				return checkingAccount;
		}
			
		// TODO Auto-generated method stub
		return null;
	}

}
