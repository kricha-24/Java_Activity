import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HotelMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1.Deluxe Room");
		System.out.println("2.Deluxe AC Room");
		System.out.println("2.Suite AC Room");
		int n = Integer.parseInt(br.readLine());
		
		if(n ==1) {
        	System.out.println("Hotel Name:");
        	String name= br.readLine();
        	System.out.println("Room Square Feet Area:");
        	String rsfa= br.readLine();
        	System.out.println("Room has Wifi (yes/no:");
        	String w= br.readLine();
        	boolean b= true;
        	if(w.equalsIgnoreCase("Yes")) {
        		b=true;
        	}
        	else {
        		b=false;
        	}
        	System.out.println("Room has TV (yes/no): ");
        	String t= br.readLine();
        	boolean bt = true;
        	if(w.equalsIgnoreCase("Yes")) {
        		b=true;
        	}
        	else {
        		b=false;
        	}
	}

}
