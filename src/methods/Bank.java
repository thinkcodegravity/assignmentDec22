package methods;

public class Bank {
	String name = "Ajit";
	int accoutNumber = 789545;
	float balance = 14524878.34f;
	
	public void simpleInterest(float amount, float time, float rate)
	{
		float interest = (amount*time*rate)/100;
		System.out.println(interest);
	}
	
	public float withdraw(String name, String date, int accountNumber, float amount)
	{
		if(this.name == name && this.accoutNumber == accountNumber && this.balance>amount)
		{
			return amount;
		}
		else 
			return 0;
	}
	
	public float deposit(String name, String date, int accountNumber, float amount)
	{
		if(this.name == name && this.accoutNumber == accountNumber)
		{
			this.balance += amount;
			return amount;
		}
		else 
			return 0;
	} 
}
