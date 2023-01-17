package inheritance;
/*
 Write a program for Cart that inherits from calculator
Method calculateCart that takes 2 int input product price and quantity and returns total value of cart.
. Use parent method multiply.

 */
public class Cart extends Calculator{
	
	int calculateCart(int productPrice, int quantity) {
		int total=mul(productPrice,quantity);
		return total;
	}

	public static void main(String[] args) {
		Cart c= new Cart();
		
		System.out.println(c.calculateCart(25, 100));
		
	}

}
