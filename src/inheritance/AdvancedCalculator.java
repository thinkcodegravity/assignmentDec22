package inheritance;

/*
 Write a program for advancedCalculator that inherits from Calculator
Method square takes 1 int input and returns int area of square. use multiply from parent
Method rectangle takes 2 int input and returns int area of rectangle… use multiply method from parent

 */
public class AdvancedCalculator extends Calculator {
	
	int areaSquare(int a) {
		int area= mul(a,a);
		return area;
	}
	
	int areaRect(int a, int b) {
		int area= mul(a,b);
		return area;
	}
	
	public static void main(String[] args) {
		AdvancedCalculator a = new AdvancedCalculator();
		System.out.println(a.areaSquare(5));
		
		System.out.println(a.sub(5, 20));
	}

}
