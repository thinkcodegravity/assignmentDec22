package operators;

public class Bank {
	private double balance;
	
	public double withdraw(double amount)
	{
		if(amount<=this.balance) {
			this.balance -= amount;
			System.out.println("Withdraw success");
			return amount;
		}
		else {
			System.out.println("Insufficient balance");
			return 0;
		}
	}
	
	public double deposit(double amount) {
		this.balance += amount;
		System.out.println("Deposit successful");
		return amount;
	}
	
	
}
