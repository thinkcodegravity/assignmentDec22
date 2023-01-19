package Operators.controlflow;

public class OperatorsAndControlFlow {

	public int Calculate(int a, int b, int c) {

		int sum = a + b + c;
		return sum;
	}

	public static void main(String[] Args) {
		OperatorsAndControlFlow q = new OperatorsAndControlFlow();
		int sum;
		sum = q.Calculate(1, 2, 3);
		int sum1 = q.Calculate(5, 6, 7);
		System.out.println("print all values of: " + sum);
		System.out.println("print all values of: " + sum1);
	}
}