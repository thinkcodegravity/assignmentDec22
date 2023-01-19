package numberProblems;

import java.util.Scanner;

// this program checks if the number is palindromic
//A palindromic number is a number (such as 16461) that remains the same when its digits are reversed


public class palindromicNumber extends reverseNumbers {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER NUMBER TO CHECK: ");
		int userinput= sc.nextInt();
		
		int tempInt= reverseNumbers.reverseInt(userinput);
		
		if(tempInt == userinput) {
			System.out.println("The number is palindromic");
		}else {
			System.out.println("The number is not palindromic");
		}
		
		
	}

}
