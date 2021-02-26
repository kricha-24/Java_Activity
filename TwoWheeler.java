import java.util.Scanner;

public class TwoWheeler extends Vehicle{

	private boolean kickStart ;

	public TwoWheeler(String make, String fuel, String num, int cap, int cc, boolean b) {
		super();
	}
	
	public boolean isKickStart() {
		return kickStart;
	}

	public void setKickStart(boolean kickStart) {
		this.kickStart = kickStart;
	}

	public TwoWheeler(boolean kickStart) {
		super();
		this.kickStart = kickStart;
	}

	public void displayDetailInfo() {
		System.out.println("Availabilty of kickstart: (yes/no)");
		Scanner sc = new Scanner(System.in);  
        boolean b = sc.nextBoolean();  
         if (b == true) {  
        	 System.out.println("Availabilty of kickstart: Yes ");
         } else if (b == false) {  
        	 System.out.println("Availabilty of kickstart: No"); 
         }  
         sc.close(); 
	}
}
