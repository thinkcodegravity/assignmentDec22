package numberProblems;

import java.util.Scanner;

//program to reverse number , example 123= 321
public class reverseNumbers {
	
	static int num= 0;
	static int tempNum=0;

	public static int reverseInt(int num) {
		while(num !=0) {
			int remainder=num%10;
			tempNum= tempNum*10+remainder;
			num=num/10;
		}
		return tempNum;
	}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		
		int num= sc.nextInt();
		System.out.println("Your number reversed: "+reverseInt(num));
	}

}
