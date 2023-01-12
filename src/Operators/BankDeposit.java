package Operators;


public class BankDeposit {
	public static void main(String[] args) {
		 int balance=7500;
		
		 
		 balance= Deposit(balance,500);}
	public static int Deposit(int balance, int deposit) {
		int  finalbalance= balance+deposit;
		System.out.println("your current balanceis :"+finalbalance);
		
			
		return finalbalance;}
	}


