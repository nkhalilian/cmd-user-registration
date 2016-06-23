package com.niloufar.khalilian.classes;

import com.niloufar.khalilian.interfaces.ReadCommand;
import com.niloufar.khalilian.interfaces.WriteCommand;

public class Controller {
	private ReadCommand readCommand;
	private WriteCommand writeCommand;
	private UserFactory userFactory;
	private ListWriteCommand listWriteCommand;
	private ListReadCommand listReadCommand;
	
	public void commandProcess(Command command){
		if(command.getCommand().equals("NewUser")){
			int id=registerNewUser(command.getParameters());
			System.out.println("New user has been added with id : ");
			System.out.println(id);
		}
		if (command.getCommand().equals("PrintUser")){
			User user=retrieveInfo(command.getParameters());
			if(user==null)
				System.out.println("User with this Id is not exist in database!!");
			user.PrintInfo();
			
		}
			
	}
	
	public int registerNewUser(String options){
		String[] info= new String[6];
		info=options.split(":");
		this.userFactory= new UserFactory();
		User user=this.userFactory.createUser(info[0],info[1],info[2]);
		listWriteCommand= new ListWriteCommand();
		int id=listWriteCommand.writeCommand(user);
		return id;
	}
	
	
	public User retrieveInfo(String info){
		int id= Integer.parseInt(info);
		listReadCommand= new ListReadCommand();
		User user=listReadCommand.readUser(id);
		if (user==null){
			return null;
		}
		return user;
		
	}

}
