package methods;

public class Product_input {

public static double Total_value(int quantity, double price) {
		
		double Value = quantity * price;
		
		return Value;
}
	
	public static void main(String args[]) {
		Total_value(2,10.5);
	}
}
