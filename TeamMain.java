package com.ltts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TeamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<PlayerMain> al=new ArrayList<PlayerMain>();
		System.out.println("Enter number of teams: ");
		int num =sc.nextInt();
		for(int i=0;i<num ;i++)
		{
			System.out.println("Enter team 1 detail"+(i+1));
			System.out.println("Enter Name"+(i+1));
			String name=sc.next();
			System.out.println("Enter number of matches"+(i+1));
			String skill =sc.next();
			al.add(new TeamMain(name, numberOfMatches));
		}
		System.out.println("Team list after sort by number of matches "); 
        Collections.sort(al, new TeamComparator());
        for (int i=0; i<al.size(); i++)
            System.out.println(al.get(i));
 
	}
	

}
