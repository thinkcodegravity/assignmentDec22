package operators;

/*
Create amazon program
(has-a)Declare global variable stock
Create order method. 
Based on If order quantity is less than stock
print order approved or cancelled.
 */


public class AmazonProgram {//start class AmazonProgram
	static int stock; //variable stock declaration
	
	static void order(int orderQty, int stock) { //method order with input paramaters orderQty and stock
		if(orderQty<=stock) {
			System.out.println("Order Approved!!");
		}else {
			System.out.println("Order Cancelled, Exceeds Stock Amount!!");
		}
	}

	public static void main(String[] args) {
		
	int orderQty =25;
	int stock=232131;
	
	order(orderQty,stock); //calling method order.

	}

}
