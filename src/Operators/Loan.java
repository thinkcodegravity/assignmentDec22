package Operators;
import java.util.Scanner;

public class Loan {
	static long money=9000000;
	public static void applyLoan(){
		Scanner sc= new Scanner(System.in);
		System.out.println("ENter the loan amount in number:");
		int loan=sc.nextInt();
		if(loan<money) {
			System.out.println("Loan approved");
		}
		else {
			System.out.println("Loan denied");
		}
	}
	public static void main(String[] args) {
		applyLoan();
		
	}

}
