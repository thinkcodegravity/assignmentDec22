package Operators;
import java.util.Scanner;

public class LogIn {
	
	public static void main(String[] args) { 
	 String registerUserid= "Abhis123";
	 String psswd="123459";
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter username :");
	String username= sc.nextLine();
	
	System.out.println("Enter password:");
	String password= sc.nextLine();
	
	if (username.equals(registerUserid) && password.equals(psswd)) {
		System.out.println("Login successful");

	}
	else {
		System.out.println("Please try again");
	}
	
}}
