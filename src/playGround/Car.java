package playGround;

public class Car {
	
	int vin=123;
	String color = "White";
	int door=4;
	
	public Car(String c) {
		color = c;
	}
	
	public Car(int d) {
		door = d;
	}
	
	public Car(String c, int d) {
		color = c;
		door = d;
	}
}
