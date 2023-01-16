package controlFlows;


/*
Write a method that takes number as input using while loop
Print multiple of 1 to 10 for this input
 */

public class CFProgram5 {
	
	static void multiply(int n) {
		for(int i=1;i<=10;i++) {
			System.out.println(i*n);
		}
	}

	public static void main(String[] args) {
		multiply(1);

	}

}
