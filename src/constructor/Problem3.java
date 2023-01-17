package constructor;
/*
Write a program for Payment
Payment has creditCardNumber, creditcardExpiry,creditCardSecCode,paypalUsserid,paypalPassword
Can construct payment
By creditCardNumber, creditcardExpiry,creditCardSecCode
By paypalUsserid,paypalPassword
*/


public class Problem3 {
	short creditCardSecCode;
	int paypalUsserid;
	String creditcardExpiry,paypalPassword;
	long creditCardNumber;
	
	Problem3(long creditCardNumber, String creditcardExpiry,short creditCardSecCode){
		this.creditCardNumber=creditCardNumber;
		this.creditcardExpiry=creditcardExpiry;
		this.creditCardSecCode=creditCardSecCode;
	}
	
	Problem3(int paypalUsserid, String paypalPassword){
		this.paypalUsserid=paypalUsserid;
		this.paypalPassword=paypalPassword;
	}
	
	public static void main(String[] args) {
		
		Problem3 a = new Problem3(4444444444L,"01/03", (short) 123);
		System.out.println("Card: "+a.creditCardNumber+ " Exp: "+a.creditcardExpiry+" Sec Code: "+a.creditCardSecCode);
		
	}

}