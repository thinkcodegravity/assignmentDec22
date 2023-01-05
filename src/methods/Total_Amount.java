package methods;

public class Total_Amount {

	public static double total_amount(double price, double discount) {
		
		double total_price = price - (price*discount)/100;
		return total_price;
}
	
	public static void main(String args[]) {

		double result = total_amount(48000,17);
		System.out.println(result);

	}
}
