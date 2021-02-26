import java.util.*;
import java.util.Scanner;

class Factorial{
	public static void main(String args[])
	{
		int fv;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a = sc.nextInt();
		
		fact(a);
		
	}
	
	static void fact(int f){
		int a[] = new int[5];
		if(f > 32767){
			System.out.println("Number too large");
		}else if(f<0){
			System.out.println("Number too short");
		}else{
			int x = f;
			int mod = 0;
			for (int i = 0 ; i < a.length ; i++){
				while(x != 0){
					a[i]= x % 10;
					x = x / 10;
			}
			int o = 1;
			for(int j = 1; j <= a[i] ; j++){
				o *= j;
			}
			a[mod]=o;
			System.out.println(a[mod]);
			mod++;
			}
		}
	}
}