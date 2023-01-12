package Operators;

public class AreaofSqr {
	public static int areasquare(int length) {
		int areasquare= length^2;
		return areasquare;

		
	}
	public static void main(String[] args) {
		int length= 25;
		int y= areasquare(length);
		System.out.println("the area of square:"+ y);
	}

}



