package com.niloufar.khalilian.interfaces;

public interface Account {
	public void withdraw(String amount);
	public void deposit(String amount);
	public void transfer(Account targetAccount, String amount);

}
