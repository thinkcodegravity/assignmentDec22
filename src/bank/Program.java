package bank;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		System.out.println("----------------------------------------------------------------------");
		System.out.println("\t\t\tWelcome to Kangal Bank \n\n\t\t\tPress enter to continue");
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		// code to connect to database and check username and password
		System.out.println(" Enter the corresponding the number for operation");
		System.out.println("\n1. Check current balance \n2. Make deposit \n3. Withdraw money \4.Exit");
		int choice = sc.nextInt();
		switch(choice) {
		case 1: 
		}
;		Account ajit = new Account();
		ajit.openAccount(123456789, "Ajit Shukla", "Checking", 100.5);
		ajit.checkBalance();
		ajit.showAccount();
		ajit.deposit(200);
	}

}
