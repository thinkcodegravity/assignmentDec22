package controlFlows;

//Write a method that takes number as input using for loop
//Print 1 , 2,3 … till the number provided as input 

public class CFProgram1 { //start of class
	
	static int printTill(int n) { //method printTill that takes integer as input
		for(int i=1; i<=n; i++) {
			System.out.println(i);;
		}
		return 1;
	}

	public static void main(String[] args) {
		printTill(5);

	}

}
