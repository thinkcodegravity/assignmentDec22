package controlFlows;
import java.util.Scanner;

public class RetrieveDetails {
	long phoneNumber;
	private String userId;
	String password;
	
	Scanner sc = new Scanner(System.in);
	
	public RetrieveDetails() {
		this.phoneNumber = 1234567890;
		this.password = "nepal123";
		this.userId = "codeGravity";
	}
	
	public void createAccount() {
		System.out.println("Enter userID: ");
		this.userId = sc.nextLine();
		System.out.println("Enter password: ");
		this.password = sc.nextLine();
		System.out.println("Enter phone number: ");
		this.phoneNumber = sc.nextLong();
	}
	
	public long retrieveUserId() {
		System.out.println("Enter your phone number: ");
		long number = sc.nextLong();
		if( number== this.phoneNumber) {
			System.out.println("Your userID is: " + this.userId);
			return number; 
		}
		else {
			System.out.println("Worng phone number");
			return 0;
		}
	}
}
