package controlFlows;
import java.util.Scanner;

public class ForIfDemo {

	Scanner sc = new Scanner(System.in);
	
	public void takeNumber() {
		System.out.println("Enter a number");
		int num = sc.nextInt();
		for(int i=1; i<=num; i++) {
			System.out.println(i);
		}
	}
}
