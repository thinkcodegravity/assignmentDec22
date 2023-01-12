package Operators;
import java.util.Scanner;

public class Amazon {
	static int stock=1500;
	
	public static void order() {
		Scanner od= new Scanner(System.in);
		System.out.println("Enter the number of stocks you want to purchase:");
		int stc=od.nextInt();{
			if(stc>stock) {
				System.out.println("Order cancelled");
			}
			else {
				System.out.println("Order approved");
			}
		}
	}

	


	public static void main(String[] args) {
		order();
		
	}
}
