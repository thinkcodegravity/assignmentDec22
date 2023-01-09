package scope;

public class Withdraw {

		public static void main(String[] args) {
			Bank wd=new Bank();
			Bank wd2= new Bank();
			wd.balance=10000;
			wd2.balance=5000;
			wd.withdrawamt=2500;
			wd2.withdrawamt=5560;
			
			long totalwd= wd.balance- wd.withdrawamt;
			System.out.println("total balance left:"+ totalwd);
			System.out.println("amount withdrawn:"+wd.withdrawamt);
		
		}

}
