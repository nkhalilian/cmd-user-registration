package com.niloufar.khalilian.classes;

import com.niloufar.khalilian.interfaces.WriteCommand;

public class ListWriteCommand implements WriteCommand{

	private DB dbobj;
	public int writeCommand(CheckingAccount checkingAccount) {
		this.dbobj= new DB();
		int id=dbobj.myadd(checkingAccount);
		return id;
	}
	

}
