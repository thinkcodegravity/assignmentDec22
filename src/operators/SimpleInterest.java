package operators;

import java.util.Scanner; //importing Scanner class

/*
 * Calculating simple interest with P T R as input and return simple interest.
 *  Include local variable that can calculate PTR/100.
 */
public class SimpleInterest {
	
	public static float sI (float p, float t, float r) {//method start
		float simpleInterest = ((p*t*r)/100);//local var simpleInterest
		return simpleInterest;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); //create Scanner object
		
		System.out.println("Enter principal");
		float principal= sc.nextFloat();
		
		System.out.println("Enter time in years");
		float timeInYears= sc.nextFloat();
		
		System.out.println("Enter rate");
		float rate= sc.nextFloat();
		
		System.out.println("Simple interest is: "+sI(principal,timeInYears,rate));

	}

}
