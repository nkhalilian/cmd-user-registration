package com.niloufar.khalilian.classes;

import java.awt.List;
import java.util.ArrayList;

import com.niloufar.khalilian.interfaces.WriteCommand;

public class ListWriteCommand implements WriteCommand{

	private DB dbobj;
	public int writeCommand(User user) {
		this.dbobj= new DB();
		int id=dbobj.myadd(user);
		return id;
	}

}
