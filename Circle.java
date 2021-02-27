
public class Circle extends Shape {
	void calculateArea(int value) {
		double pi = 3.14;
		double area = (int) (pi * value * value);
		System.out.printf("Area of circle is:"+area);
	}
}
