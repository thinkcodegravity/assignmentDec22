package operators;

import java.util.Scanner;

//Create currency program
//Take dollar as input and return the UK pound equivalent

public class CurrencyExchange {

	static float exchangeToPounds(float usd) { //start of method, takes float input, returns float
		float exchangeRate = 0.82f;
		float exchangeAmt= usd*exchangeRate;
		return exchangeAmt;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter $ amount to convert: ");
		Scanner sc= new Scanner(System.in); //create object of Scanner class
		
		float input1= sc.nextFloat();  
		
		float amtInPounds=exchangeToPounds(input1); //declaration and initilization of variable 
		System.out.println("You will recieve "+ amtInPounds+" pounds for "+input1+" usd.");
	}

}
