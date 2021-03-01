package com.ltts;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ListAct3Main {
	
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
		
		System.out.println("Enter the top 5 Scorers of ipl season 12: ");
		String b1 = br.readLine();
		String b2 = br.readLine();
		String b3 = br.readLine();
		String b4 = br.readLine();
		String b5 = br.readLine();
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add(b1);
		al2.add(b2);
		al2.add(b3);
		al2.add(b4);
		al2.add(b5);
		
		
		al.retainAll(al2);
		System.out.println("top players are" +al);
		
	}
}

