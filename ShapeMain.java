import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShapeMain {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader b =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1.Cirlce");
		System.out.println("2.Square");
		System.out.println("Enter the shape: ");
        int s = Integer.parseInt(b.readLine());
        if(s == 1) {
        	System.out.println("Enter the radius ");
        	int value = Integer.parseInt (b.readLine());
        	Circle c = new Circle ();
        	c.calculateArea(value);
        }
        else if (s == 2 ) {
        	System.out.println("Enter the sides: ");
        	int value = Integer.parseInt(b.readLine());
        	Square sq = new Square();
        	sq.calculateArea(value);
        }
}}
