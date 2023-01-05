package methods;

public class Deposit {

	public static double deposit(double d_amount, double old_balance) {
		
		double new_balance = old_balance + d_amount;
		return new_balance;
}
	
	public static void main(String args[]) {
		
		deposit(1000,10000);
	
}
}
