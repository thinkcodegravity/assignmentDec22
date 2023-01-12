package Operators;

public class Bank {
	public static void main(String[] ags) {
		int balance= 7500;
		//int balance1=7500;
		int withdraw;
	//	int deposit;
//		
	balance= Withdraw( balance,9000);
}
		//System.out.println("your balance is:"+ balance);}

	
		
		public static int Withdraw(int balance, int withdraw) {
			
			if (balance>=withdraw) {
				System.out.println("withdraw cash");
				int finalbalance= balance- withdraw;
				System.out.println("your remaining balance is:"+finalbalance);}
			else {
				System.out.println("not enough funds");		
			}
			return balance;}}
			
			
		
		
