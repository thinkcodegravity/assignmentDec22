package operators;

import java.util.Scanner;

/*
 * Create a method that can return total final amount
 * if input provided is product price and discount percentage.
 */

public class CalcFinalPrice {//start class CalcFinalPrice
	
	float finalAmount(float productPrice, float discountPercentage) {//method finalAmt with 2 float input parameters
		float finalPrice,discount;                          //
		discount=(productPrice*discountPercentage);         //method body
		finalPrice=(productPrice-discount);                 //
		return finalPrice;                                  //
		
	}

	public static void main(String[] args) {//Start main method
		System.out.println("Enter item price: ");
		Scanner sc= new Scanner(System.in); //create Scanner(class) object
		float itmPrice= sc.nextFloat();
		
		System.out.println("Enter discount percentage: ");
		float discountPerc= sc.nextFloat();
		discountPerc=(discountPerc/100);
		
		CalcFinalPrice fp= new CalcFinalPrice();  //Create CalcFinalPrice(class) object
				
		
		System.out.println("Final Price: "+fp.finalAmount(itmPrice, discountPerc));
		
	}

}
