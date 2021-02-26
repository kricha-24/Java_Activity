import java.util.Scanner;
public class stringsecond {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
		System.out.print("First Player Name: ");
		String s1= sc.nextLine();
		System.out.print("Second Player Name: ");
		String s2= sc.nextLine();
		int s1Length = s1.length();
        int s2Length = s2.length();
        
            String s12=s1.split(" ")[s1.split(" ").length-1];
            String s11 = s1.substring(0, s1.length() - s12.length());

            String s22=s2.split(" ")[s2.split(" ").length-1];
            String s21 = s2.substring(0, s2.length() - s22.length());

            if(s12.equals(s22))
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
       }
}