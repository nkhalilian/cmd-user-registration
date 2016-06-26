package com.niloufar.khalilian.classes;

public class Command {
	private String command;  
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


}
