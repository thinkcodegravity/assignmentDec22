package Operators.controlflow;

public class CalculateCircle {

	public double areaOfcircle(int radius) {
		double pi = 3.142, area;
		area = pi * radius * radius;
		return area;
	}
	public double areaOfRectangle(double l, double w){
		
		double areaOfRectangle = l*w;
		return areaOfRectangle;
		
	}
	
public double areaOfSquare(double a){
		
		double areaOfSquare = a*a;
		return areaOfSquare;
	
}
	public static void main(String[] args) {

		CalculateCircle x = new CalculateCircle();
		double areaOfCircle = x.areaOfcircle(5);
		System.out.println("area of circle:" + areaOfCircle);

	}

}
