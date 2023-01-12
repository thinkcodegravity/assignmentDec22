package Operators;

import java.util.Scanner;

public class UkPound {
static double pound=1.22;
	public static void main(String[] args) {
		Scanner pd=new Scanner(System.in);
		System.out.println("Print dollars you want to exchange");
		double pnd= pd.nextDouble();
		double poun= pnd*pound;
		System.out.println("The UK pound equivalent is:"+ poun);
		
		
	}

}
