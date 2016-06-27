package com.niloufar.khalilian.classes;

import java.util.Scanner;

import com.niloufar.khalilian.interfaces.ReadCommand;
import com.niloufar.khalilian.interfaces.WriteCommand;

public class Controller {
	private ReadCommand readCommand;
	private WriteCommand writeCommand;
	private UserFactory userFactory;
	private ListWriteCommand listWriteCommand;
	private ListReadCommand listReadCommand;
	private CheckingAccount checkingAccount;
	private DB dbobj;
	private Scanner scanner = new Scanner(System.in);
	
	public void commandProcess(Command command){
		
		if(command.getCommand().equals("NewUser")){
			int id=registerNewUser(command.getParameters());
			if(id!=0){
				System.out.println("New user has been added with id : ");
				System.out.println(id);
			}
			else
				System.out.println("User already exist!");			
		}
		
		else if (command.getCommand().equals("PrintUser")){
			CheckingAccount checkingAccount=retrieveInfo(command.getParameters());
			if(checkingAccount==null)
				System.out.println("User with this Id is not exist in database!!");
			else
				checkingAccount.printAccount();
		}
		
		else if(command.getCommand().equals("Deposit")){
			deposit(command.getParameters());
		}
		
		else if(command.getCommand().equals("Withdraw")){
			withdraw(command.getParameters());			
		}
		
		else if(command.getCommand().equals("Transfer")){
			transfer(command.getParameters());
		}
		else 
			System.out.println("Command not known");
			
	}
	
	public int registerNewUser(String options){
		String[] info= new String[6];
		info=options.split(":");
		this.userFactory= new UserFactory();
		User user=this.userFactory.createUser(info);
		checkingAccount= new CheckingAccount(user);
		if(!userFactory.userExist(info[0])){
			listWriteCommand= new ListWriteCommand();
			int id=listWriteCommand.writeCommand(checkingAccount);
			return id;
		}
		else
			return 0;
	}
	
	
	public CheckingAccount retrieveInfo(String options){
		int id= Integer.parseInt(options);
		listReadCommand= new ListReadCommand();
		checkingAccount=listReadCommand.readUser(id);
		if (checkingAccount==null){
			return null;
		}
		return checkingAccount;
		
	}
	
	public void deposit(String options){
		String[] info= new String[6];
		info=options.split(":");
		dbobj= new DB();
		checkingAccount= dbobj.retrieveAccount(info[0]);
		if(checkingAccount==null)
			System.out.println("This id doesn't exist in the system!");
		else{
			System.out.println("Please everify target user by say yes or no:");
			System.out.println(checkingAccount.getUser().getUserName());
			String verify=scanner.nextLine();
			if(verify.toLowerCase().equals("yes"))
				checkingAccount.deposit(info[1]);
			else
				System.out.println("You entered id wrong!");
			}
	}
	
	public void withdraw(String options){
		String[] info= new String[6];
		info=options.split(":");
		dbobj= new DB();
		checkingAccount= dbobj.retrieveAccount(info[0]);
		if(checkingAccount==null)
			System.out.println("This id doesn't exist in the system!");
		else{
			System.out.println("Please everify target user by say yes or no:");
			System.out.println(checkingAccount.getUser().getUserName());
			String verify=scanner.nextLine();
			if(verify.toLowerCase().equals("yes"))
				checkingAccount.withdraw(info[1]);
			else
				System.out.println("You entered id wrong!");
			}
	}

	
	public void transfer(String options){
		String[] info= new String[6];
		info=options.split(":");
		dbobj= new DB();
		CheckingAccount sourceChechingAccount= dbobj.retrieveAccount(info[0]);
		CheckingAccount targetCheckingAccount= dbobj.retrieveAccount(info[1]);
		if(sourceChechingAccount==null)
			System.out.println("Source Id is wrong!");
		else if(targetCheckingAccount==null)
			System.out.println("Target Id is wrong!");
		else
			sourceChechingAccount.transfer(targetCheckingAccount,info[2]);
	}
}
