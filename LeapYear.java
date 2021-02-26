import java.util.*;
import java.util.Scanner;

class LeapYear{
	public static void main(String args[]){
		
		int l;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Year you want to check: ");
		int y = sc.nextInt();
		
		l = CheckLeapYear(y);
		if (l == -1){
			System.out.println("Invalid Input");
		}else{
			System.out.println("Output is: "+l);
		}
		
	static int CheckLeapYear(int year){
		if (year % 4 == 0 && year % 400 == 0){
			return 1;
			System.out.println("1");
	    }
		else if(year % 100 == 0){
			return 0;
			System.out.println("0");
			}
		else if(year < 0){
			return -1;

			System.out.println("-1");
		}
		
		}
}