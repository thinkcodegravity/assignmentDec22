package operators;

public class Area {
	
	// calculate and return area of square
	public void square(double length) {
		double area = Math.pow( length, 2);
		System.out.println(area);		
	}

	// calculate and return area of circle
	public void circle(double radius) {
		double area = Math.PI * radius * radius;
		System.out.println(area);		
	}
	
	// calculate and ===area of rectangle
	public void rectangle(double length, double breadth) {
		double area = length * breadth;
		System.out.println(area);		
	}
	
}
