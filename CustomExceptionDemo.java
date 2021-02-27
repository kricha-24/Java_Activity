package com.ltts;
import java.util.Scanner;

class CustomException extends Exception {

	CustomException() {
		System.out.println("CustomException: InvalidAgeRangeException");
	}
}

public class CustomExceptionDemo {

	public static void main(String[] args) throws CustomException {
		// TODO Auto-generated method stub
       
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.nextLine();
		System.out.println("Enter your age");
		int age=sc.nextInt();
		if(age<=19) 
		{
			throw new CustomException() ;
				
		}
		else {
				System.out.println("Players'name:"+name);
				System.out.println("Players'age:"+age);
			}
		}
	}
