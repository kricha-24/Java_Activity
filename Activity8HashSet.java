package com.ltts;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Activity8HashSet {
	public static void main(String[] args) throws Exception {
		
		HashSet h = new HashSet();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(br.readLine());
		String name1= br.readLine();
		String name2= br.readLine();
		String name3= br.readLine();
		String name4= br.readLine();
		String name5= br.readLine();
		
		h.add(name1);
		h.add(name2);
		h.add(name3);
		h.add(name4);
		h.add(name5);
		
		System.out.println(h.size());
	}

}
