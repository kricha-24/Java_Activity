package com.ltts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ListAct1Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		 ArrayList a =new ArrayList(); 
		 BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Enter the Player's details: ");
		 System.out.println("Enter Player name: ");
		 String name = (b.readLine());
		 a.add(name);
		 System.out.println("Enter Age: ");
		 int age = Integer.parseInt(b.readLine());
		 a.add(age);
		 System.out.println("Enter Country: ");
		 String country = (b.readLine());
		 a.add(country);
		 System.out.println("Player's details: ");
		 for (Object player: a){
		      System.out.println(player);
		    }
		 
		 System.out.println("Enter skill: ");
		 String skill = (b.readLine());
		 System.out.println("Enter the position to add the skill: ");
		 int post = Integer.parseInt(b.readLine());
		 a.add(skill);
		 System.out.println("Player's details: ");
		 for (Object player: a){
		      System.out.println(player);
		 }
		 System.out.println("Enter the position of the detail to be removed: ");
		 int delete = Integer.parseInt(b.readLine());
		 a.remove(delete);
		 System.out.println("Player's details: ");
		 for (Object player: a){
		      System.out.println(player);
		 }
				 
	}
	
	}


