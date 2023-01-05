package methods;

public class Withdraw {

public static double withdraw(double w_amount, double old_balance) {
		
		double new_balance = old_balance - w_amount;
		return new_balance;
}
	
	public static void main(String args[]) {
		
		withdraw(1000,10000);
	}
}
