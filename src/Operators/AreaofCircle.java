package Operators;

public class AreaofCircle {
	public static float areacircle(int radius) {
		float pi=3.14f;
		float areacircle= pi*(radius^2);
		return areacircle;
		
	}
	public static void main(String[] args) {
		int radius= 25;
		float y= areacircle(radius);
		System.out.println("the area of circle:"+ y);
	}

}





