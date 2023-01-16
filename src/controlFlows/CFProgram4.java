package controlFlows;

/*
Write a shopping program that has-a balance, product price
Create a checkout method that takes orderquantity as input. 
Calculate total cart price based on quantity input and product price.
If total cart prices is less than balance than return success else return failure

 */

public class CFProgram4 {
	static int balance=9000;
	static int productPrice= 3005;
	static int inputQty= 5;
	
	int checkout(int orderQty) {
		return orderQty;		
	}
	
	public static void main(String[] args) {
		int totalPrice= inputQty*productPrice;
		
	if(totalPrice<=balance) {
		System.out.println("Purchase Successful");
		}else {
			System.out.println("Purchase Failed");
		}
	}

}
