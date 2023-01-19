package Operators.controlflow;

public class Calculate {
	
public int Calculate (int a, int b, int c) {
	
	int sum= a+b+c;
	return sum;
}

   public static void main ( String[]Args) {
	   
	   Calculate  c = new Calculate();
	  int sum =  c.Calculate(5,6,7);
	  System.out.println("print value; " + sum);
	  
   }
}
