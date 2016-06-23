package com.niloufar.khaliian.UserRegistration;
import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

import com.niloufar.khalilian.classes.Command;
import com.niloufar.khalilian.classes.Controller;
import com.niloufar.khalilian.classes.DB;
import com.niloufar.khalilian.classes.User;

/**
 * Registration
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {
    	while(true){
    		Scanner scanner = new Scanner(System.in);
    		String input = scanner.nextLine();
    		if (input.toLowerCase().equals("exit"))
    			break;
    		Command command = new Command(input);
    		Controller controller= new Controller();
    		controller.commandProcess(command);
    	   		
    
    	}
    	DB db= new DB()
;
    	//db.PrintDB();
        
        
    }
}
