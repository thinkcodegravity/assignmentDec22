package controlFlows;
import java.util.Scanner;

//Write a method to print “customer care” if input to method is 1
//else print “other help”.
public class CFProgram2 {
	
	static void print(int num) {
		if(num!=1) {
			System.out.println("OTHER HELP");
		}else {
			System.out.println("Customer Care");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter integer value: ");
		
		int input= sc.nextInt();
		
		print(input);
		
	}

}
