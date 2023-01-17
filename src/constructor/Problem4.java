package constructor;

/*
Write a program for MoneyTransfer
MoneyTransfer has-a receiverAccountNumber, ReceiverPhone,ReceiverEmail,Amount
Can construct MoneyTransfer 
By receiverAccountNumber and amount
By receiverPhoen and amount
By ReceiverEmail and amount
 * 
 */

public class Problem4 {
	float amount;
	String receiverEmail;
	int receiverAccountNumber;
	long receiverPhone;
	
	Problem4(int receiverAccountNumber, float amount){
		this.receiverAccountNumber=receiverAccountNumber;
		this.amount=amount;
	}
	//cannot create 2 constructors with the same input-paramaters
	Problem4(long receiverPhone ,float amount){
		this.receiverPhone=receiverPhone;
		this.amount=amount;
	}
	
	Problem4(String receiverEmail, float amount){
		this.receiverEmail=receiverEmail;
		this.amount=amount;
	}
	
	public static void main(String[] args) {
		
		Problem4 a= new Problem4(9999999999L,12312.25f);
		System.out.println("Phone: "+ a.receiverPhone);
		System.out.println("$: "+a.amount);
		
		
	}

}