package controlFlows;

public class Shopping {

	private float balance;
	private float productPrice;
	
	public boolean checkout(int quantity) {
		float total = quantity * this.productPrice;
		if(this.balance>total) {
			System.out.println("Checkout complete.");
			return true;
		}
		System.out.println("Insufficient balance");
		return false;
	}
	
}
