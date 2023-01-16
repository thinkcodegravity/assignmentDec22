package operators;

import java.util.Scanner; //importing the scanner class

//Method that can calculate sum of 3 numbers and return sum


public class SumMethod {//start of class SumMethod
	static int sum, num1,num2; //variable declaration
	
	public static int sum(int a,int b) { //start of method sum
		sum=a+b;                //method body
		return sum;             //method body
	}

	public static void main(String[] args) { //start of main class
		Scanner sc=new Scanner(System.in);   //creating scanner object sc
		
		System.out.println("Enter number1");
		num1=sc.nextInt(); //reassigning num1 to next user input
		
		System.out.println("Enter number2");
		num2=sc.nextInt(); //reassigning num2 to next user input
		
		sum(num1,num2); //method call statement
		System.out.println("Sum of these numbers: "+sum);
		
		
		

	}

}
