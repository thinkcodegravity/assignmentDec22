package operators2;

public class Amazon {

	private int stock;
	
	public void order(int quantity) {
		if(quantity < this.stock)
			System.out.println("Order approved");
		else
			System.out.println("Order cancelled");
	}
}
