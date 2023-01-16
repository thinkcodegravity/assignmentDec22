package operators;


public class Area {//start of class areOfSquare
	
/*
Create a method that can calculate area of square
Accept side as input variable
Use local variable to calculate area of square
*/
	 void areaSquare(int side) { //start of method areaOS
		int area; //area is local variable
		area= side*side;
		System.out.println("Area of Square:"+ area);
	}
/*
Create a method that can calculate area of circle.
Accept radius as input variable
Use local variable to calculate area of circle
*/
	 void areaCircle(float r) { //start of method areaSquare
		float valueOfPi= 3.14f; //local variable declaration+ initialization
		float area; //area is local variable
		area= valueOfPi*(r*r);
		System.out.println("Area of Circle:"+ area);
	}
	 
 //Create a method that can calculate area of circle.
	 void areaRect(int l, int w) {
		 int area= l*w; //area is local variable
		 System.out.println("Area of rectangle:"+ area);
	 }

	public static void main(String[] args) {
		Area a= new Area(); //creating object for class areOfSquare 
							//since all 3 methods are non-static
		
		int side=25; 
		float radius=10.25f;
		int length=25;
		int width=3;
		
		a.areaCircle(radius);
		a.areaRect(length, width);
		a.areaSquare(side);
		
	}

}
