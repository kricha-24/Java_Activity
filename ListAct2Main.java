package com.ltts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class ListAct2Main {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the top 5 scorers of IPL Season 13: ");
		String a1 = br.readLine();
		String a2 = br.readLine();
		String a3 = br.readLine();
		String a4 = br.readLine();
		String a5 = br.readLine();
		
		ArrayList<String> al = new ArrayList<String>();
		al.add(a1);
		al.add(a2);
		al.add(a3);
		al.add(a4);
		al.add(a5);
		
		System.out.print("enter the position1 where to swap : ");
		int pos1 = Integer.parseInt(br.readLine());
		System.out.print("enter the position2 where to swap : ");
		int pos2 = Integer.parseInt(br.readLine());
		
		
		Collections.swap(al, pos1, pos2);
		System.out.println("****AFTER SWAPPING****");
//		System.out.println(al);
		
		for(String s : al) {
			System.out.println(s);
		}
		
		
	}
}