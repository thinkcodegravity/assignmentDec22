package methods;

public class Rectangle {

public static double Area_Rectangle(double length, double breadth) {
		
		double area = length * breadth; 
		return area;
}
	
	public static void main(String args[]) {
		double result = Area_Rectangle(2,5);
		
		System.out.println(result);
	}
}
