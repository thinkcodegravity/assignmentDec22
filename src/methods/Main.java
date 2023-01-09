package methods;

public class Main {
	public static void main(String[] args) {
		Bank bank = new Bank();
		float withdrawAmount = bank.withdraw("Ajit", "1/7/2023", 789545, 1000);
		System.out.println(withdrawAmount);
	}
}
