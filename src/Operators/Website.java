package Operators;
import java.util.Scanner;

public class Website {
	 static String existingUserid="Abhis123";
	
	public  static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter new user id:");
		String userid= sc.nextLine();
		System.out.println("Enter new password:");
		String password= sc.nextLine();
		if (userid.equals(existingUserid)) {
			System.out.println("registration faile. Please try again with new userid");
			
		}
		else {
			System.out.println("Registration successful");
		}
		
	sc.close();	
	}
	

}
