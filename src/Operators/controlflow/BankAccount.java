package Operators.controlflow;

public class BankAccount {
	
	private int balance;
	

	public void withdraw( int amount ) {
		balance = balance - amount;
		
	}
	public void deposit(int amount) {
		balance = balance + amount;
		
	}
	
	public boolean hasBalance() {
		return balance > 0;
	}
	
	
		public static void main (String []Args){
		
			BankAccount b = new BankAccount() ;
			
		    boolean hasBalanceLocal = b.hasBalance();
		    
		    System.out.println("First Blance - " + hasBalanceLocal);
		    
		    
			b.deposit (100 );
			
            hasBalanceLocal = b.hasBalance();
		    
		    System.out.println("Second Blance - " + hasBalanceLocal);
		    System.out.println("Blance - " + b.balance);
		    
		    b.withdraw(50);
		    
		    hasBalanceLocal = b.hasBalance();
		    
		    System.out.println("Thrid Blance - " + hasBalanceLocal);
		    System.out.println("Blance - " + b.balance);
		    
			
			
		}
	}

