package scope;
//Bank program does withdraw functionality that takes withdraw amount as input
public class Bank {
	
	double balance;
	double amount;
	
	public void withdraw(double amount) {
		balance=balance-amount;
		
	}
	public static void main(String[] args)
	{
		Bank abc=new Bank();
				abc.withdraw(200);
	}
}

