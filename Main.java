package com.ltts;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		 System.out.println("Enter the player name: ");
       
		 map.put("ashwin", 10); 
		 map.put("sachin", 30); 
		 map.put("vaibhav", 20); 
		 System.out.println("Enter wickets - seperated by \"|\" symbol."); 
		 
		 System.out.println(map); 
		 if (map.containsKey("vishal")) { 
			 Integer a = map.get("vishal"); 
             System.out.println("value for key"+ " \"vishal\" is:- " + a); 
        } 
    } 
	}


