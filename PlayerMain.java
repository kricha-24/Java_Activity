
package com.ltts;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PlayerMain {

	public PlayerMain(String name, String skill) {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		ArrayList<PlayerMain> al=new ArrayList<PlayerMain>();
		System.out.println("Please provide the number of players to be registered");
		int num =sc.nextInt();
		for(int i=0;i<num ;i++)
		{
			System.out.println("Please enter player name"+(i+1));
			String name=sc.next();
			System.out.println("Please select the skill of the player 1.All Rounder 2.Batsman 3.Bowler"+(i+1));
			String skill =sc.next();
			al.add(new PlayerMain(name, skill));
		}
		System.out.println("Player Details sorted by skill: "); 
        Collections.sort(al, new PlayerComparator());
        for (int i=0; i<al.size(); i++)
            System.out.println(al.get(i));
 
        System.out.println("Player Details sorted by name: ");
        Collections.sort(al, new PlayerComparator());
        System.out.println("\nSorted by name");
        for (int i=0; i<al.size(); i++)
            System.out.println(al.get(i));
    }

	}

