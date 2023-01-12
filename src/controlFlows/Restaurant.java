package controlFlows;
import java.util.Scanner;

public class Restaurant {

	public void showMenu() {
		System.out.println("\tToday's menu");
		System.out.println("1. Pizza \n2. Pasta \n3. Salad");
		System.out.println("Enter number to see the price of the item: ");
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		switch(input) {
		case 1:
			System.out.println("The price of pizza is: $15");
			break;
		case 2:
			System.out.println("The price of pasta is: $10");
			break;
		case 3:
			System.out.println("The price of salad is: $7");
			break;
		default:
			System.out.println("The price of salad is: $7");
		}
		sc.close();
	}
}
