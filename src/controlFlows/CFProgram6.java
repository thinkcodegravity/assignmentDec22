package controlFlows;

/*
Write a method to print menu items (use Switch case)
Display the price for item selected
1 – Pizza
2 – Pasta
Default – salad
 */
public class CFProgram6 {
	
	static void print(int n) {
		switch (n) {
			case 1: 
				System.out.println("Pizza: $5");
				break;
			case 2:
				System.out.println("Pasta: $8");
				break;
			default:
				System.out.println("Salad: $4");
				}
			}

	public static void main(String[] args) {
		
		print(5);

	}

}
