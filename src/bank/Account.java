package bank;

public class Account {
	private long accountNumber;
	private String accountName;
	private String accountType;
	private double balance;
	
	Transaction transaction = new Transaction();
	
	public boolean openAccount(long accNum, String accName, String accType, double balance)
	{
		this.accountNumber = accNum;
		this.accountName = accName;
		this.accountType = accType;
		this.balance = balance;
		//transaction.setBalance(balance);
		return true;
	}
	
	public void showAccount()
	{
		System.out.println("The account details are:");
		System.out.println("Account Number : "+this.accountNumber);
		System.out.println("Account holder name : "+this.accountName);
		System.out.println("Account type : "+this.accountType);
		System.out.println("Balance : $"+this.balance);
		
	}
	
	public void deposit(double amount)
	{
		this.balance += amount;
		System.out.println("Deposit successful. \nDeposit amount : " + amount);
	}
	
	public boolean withdraw(double amount)
	{
		if(this.balance>=amount)
		{
			this.balance -=amount;
			System.out.println("Withdraw successful. \nWithdraw amount : " + this.balance);
			return true;
		}
		return false;
	}
	
	public void checkBalance()
	{
		System.out.println("The current balance is" + this.balance);
	}

}
