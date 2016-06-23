package com.niloufar.khalilian.classes;

public class Command {
	private String command;  // do I need to new it????
	private String parameters;
	
	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
	}

	public String getParameters() {
		return parameters;
	}

	public void setParameters(String parameter) {
		this.parameters = parameter;
	}

	public Command(String command){
		String[] cmd = new String[20];
		cmd=command.split(" ",2);
		this.command=cmd[0];
		this.parameters=cmd[1];
		
	}
	
//	public void runCommand(){
//		Controller registerUser = new Controller();
//		if (this.command.equals("NewUser")){
//			registerUser.registerNewUser(this.options);
//		}
//		if (this.command.equals("ShowUser")){
//			
//		}
//	}

}
