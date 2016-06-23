package com.niloufar.khalilian.classes;

import java.util.ArrayList;

public class DB {
 static ArrayList<User> db= new ArrayList<User>();
 static int userId=0;
 public int myadd(User user){
	 this.userId=this.userId+1;
	 user.setId(this.userId);
	 this.db.add(user);
	 return user.getId();
 }
 
 public void PrintDB(){
	 for(int i=0; i<db.size() ; i++)
		 System.out.println(DB.db.get(i).getId());
 }
}
