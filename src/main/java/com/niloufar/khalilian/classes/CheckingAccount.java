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

	public void withdraw(int amount) {
		if(this.balance-amount <0)
			System.out.println("Low Inventory!!!");
		else
			this.balance=this.balance-amount;
		
	}

	public void Deposit(int amount) {
		this.balance=this.balance+amount;
		
	}

	public void transfer() {
		// TODO Auto-generated method stub
		
	}

}
