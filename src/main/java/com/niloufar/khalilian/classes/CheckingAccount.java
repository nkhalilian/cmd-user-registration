package com.niloufar.khalilian.classes;

import com.niloufar.khalilian.interfaces.Account;

public class CheckingAccount implements Account{
	private User user;
	private int balance;
	
	public CheckingAccount(User user) {
		String[] info= new String[3];
		info[0]=user.getUserName();
		info[1]=user.getPassword();
		info[2]=user.getRole();
		this.user= new User(info);
		this.balance=0;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void withdraw(String amount) {
		int amt=Integer.parseInt(amount);
		if(this.balance-amt <0)
			System.out.println("Low Inventory!!!");
		else
			this.balance=this.balance-amt;
		
	}

	public void deposit(String amount) {
		int depAmount=Integer.parseInt(amount);
		this.balance=this.balance+depAmount;
		
	}

	public void transfer(Account targetAccount, String amount) {
		this.withdraw(amount);
		CheckingAccount targetCheckingAccount= (CheckingAccount)targetAccount;
		targetCheckingAccount.deposit(amount);		
	}
	
	public void printAccount(){
		System.out.println("Name of the user: ");
		System.out.println(this.getUser().getUserName());
		System.out.println("Role of the user is: ");
		System.out.println(this.getUser().getRole());
		System.out.println("Amount of money deposited in account: ");
		System.out.println(this.balance);
	}

	


	

	

}
