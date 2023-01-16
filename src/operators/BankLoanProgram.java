package operators;

import java.util.Scanner;

/*
Create bank program
(has-a)Declare global variable bank money
Create applyLoan method takes loan amount input. 
If customer requestsing loan amount is less than bank available money
print loan approved or denied.
 */

public class BankLoanProgram {
	static long bankMoney=10000000000L;
	
	boolean loanApplication(long loanAmt) {
		boolean loanStatus;
		if(loanAmt<=bankMoney) {
			loanStatus=true;
		}else {
			loanStatus=false;
		}
		return loanStatus;
	}

	public static void main(String[] args) {
		System.out.println("Enter loan amount desired: ");
		Scanner sc= new Scanner(System.in);
		long input1 = sc.nextLong();
		
		BankLoanProgram blp= new BankLoanProgram();
		if(blp.loanApplication(input1)==true) {
			System.out.println("Loan Approved!!");
		}else {
			System.out.println("Loan Declined!!");
		}
		

	}

}
