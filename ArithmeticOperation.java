import java.util.*;
import java.util.Scanner;

public class ArithmeticOperation{
	public static void main(String args[]){
		
		int s,d,p,q;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter argument nuo 1: ");
		int a = sc.nextInt();
		System.out.print("Enter argument no 2: ");
		int b = sc.nextInt();
		System.out.print("Enter argument no 3: ");
		int c = sc.nextInt();
		
		int Ao = performArithmeticOperation(a,b,c);
		switch (Ao){
			case 1:
			    s = a + b;
		        System.out.print("If argument 3 = 1, Sum = "+s);
				break;
			case 2:
			    d = a - b;
			    System.out.print("If argument 3 = 2, Diff = "+d);
				break;
			case 3:
			    p = a * b;
			    System.out.print("If argument 3 = 3, Prod = "+p);
				break;
			case 4:
			    q = a / b;
			    System.out.print("If argument 3 = 4, Quot = "+q);
				break;
			case -1:
			    System.out.print("Invalid Input");
				break;
		}
		
	}
	
	static int performArithmeticOperation(int x, int y, int z){
		int s, d, p, q;
		if (z == 1)
		{
			return 1;			
		}
		else if(z== 2)
		{
			return 2;
		}
        else if (z ==3)
		{
			return 3;			
		}
		else if (z == 4)
		{
			return 4;
		}
		else if (32767 < x || x < 0 || 32767 < y || y < 0)
		{
			return -1;
		}
		else if (z < 1 || z > 4)
		{
			return -1;
		}
		return 0;
	}
}