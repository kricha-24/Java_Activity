import java.util.Scanner;
import java.lang.String;

class compare
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		String array1[] = s1.split(" ");
		String array2[] = s2.split(" ");
		if(array1[array1.length-1].equals(array2[array2.length-1]))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
}