package operators;

/*
Bank program 
Has balance
does withdraw functionality  - include inputs , return outputs and logic.
does deposit functionality  - include inputs , return outputs and logic.
 */

public class BankProgram { //start of class BankProgram
	static int balance=1000; //variable declaration+initialization
	int withdrawAmt, depositAmt; //variable declaration
	
	public static boolean withdraw(int withdrawAmt) {//start of withdraw method
		if(withdrawAmt>=balance) {
			return true;
		}else {
			return false;
		}	
	}
	
	public static int deposit(int depositAmt) { //start of deposit method
		balance=balance+depositAmt;
		return balance;
	}

	public static void main(String[] args) {//start of main method
		
		System.out.println(withdraw(100));
		System.out.println(deposit(500));

	}

}
