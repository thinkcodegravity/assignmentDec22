package Operators;

public class FinalAmt {


	public static float amt(float price, float discountperc) {
		float y=discountperc/100;
		float amt= price*discountperc;
		return amt;
	}

	public static void main(String[] args) {
		float price= 25.95f;
		float discountperc= 50;
		float y= discountperc/100;
		float z=(price*y);
		System.out.println("The total price:"+ price);
		System.out.println("discount perc:"+y);
		System.out.println("The final price is :"+ z);
		
		

	}

}
