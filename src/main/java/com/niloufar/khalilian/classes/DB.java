package com.niloufar.khalilian.classes;

import java.util.ArrayList;

public class DB {
 static ArrayList<CheckingAccount> db= new ArrayList<CheckingAccount>();
 static int userId=0;
 public int myadd(CheckingAccount checkingAccount){
	 DB.userId=DB.userId+1;
	 checkingAccount.getUser().setId(DB.userId);
	 DB.db.add(checkingAccount);
	 return checkingAccount.getUser().getId();
 }
 
 public void printDB(){
	 for(int i=0; i<db.size() ; i++)
		 System.out.println(DB.db.get(i).getUser().getId());
 }
 
 public CheckingAccount retrieveAccount(String id){
	int idNumber=Integer.parseInt(id);
	for(CheckingAccount checkingAccount : db)
		if(checkingAccount.getUser().getId()==idNumber )
			return checkingAccount;
	return null;
		
 }
 
 
}
