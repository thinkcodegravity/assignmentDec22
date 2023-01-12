package operators2;

public class Bank {
	private double bankMoney;
	
	// apply for loan
	public void applyLoan(double amount) {
		if(this.bankMoney > amount)
			System.out.println("Loan approved");
		else
			System.out.println("Loan denied");
	}
	
	
}
