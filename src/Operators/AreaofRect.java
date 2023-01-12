package Operators;

public class AreaofRect {

	public static int arearect(int length, int breadth) {
		int arearect= length*breadth;
		return arearect;
		
	}
	public static void main(String[] args) {
		int length= 25;
		int breadth= 2;
		int y= arearect(length,breadth);
		System.out.println("the area of rectangle:"+ y);
	}

}


