package methods;

public class MethodAndReturn {

	//Methods declaration and return statements
	//Focus only on method declaration and include proper return statements. No logic required.
	
	
	//Create a method that can accept appropriate input for payment webpage and returns payment response.
	public boolean payment(long cardNo, String expDate, byte secCode) {
		return true;
	}
	
	//Create a method that can process registration
	public boolean registration(String username, String password, String confirmPassword) {
		return true;
	}
	
	//Create a method that can accept product input and calculate total cart value
	//Product program has quantity and price
	public int totalPrice(int quantity, int price) {
		int total = quantity * price;
		return total;
	}
	
	//Create a method that can calculate area of rectangle
	public double rectArea(double length, double width) {
		double area= length*width;
		return area;
	}
	
	//Create a method that can calculate simple interest
	public double interestDue(double principal, double interestRate, double time) {
		double interest= (principal*interestRate*time)/100;
		return interest;
	}
	
	//Create a method that can process withdraw from bank account
	public int withdraw() {
		int cash=100;
		return cash;
	}
	
	//Create a method that can process deposit from bank account
	public void deposit(int depositAmt) {
		
	}
	
	//Create a method that can return electricity plpuban details if provided zip code as the input
	public String plupuban(int zipCode) {
		return "   ";
	}
	
	//Create a method that can return insurance detail if provided input as age.
	public String insDetail(String age) {
		return "   ";
	}
	
	//Create a method that can return total amount if input provided is product price and discount percentage.
	public double discountPrice(double price, double discount) {
		double total= price-(price*discount);
		return total;
	}
	
	//Create a method that can return user profile if provided customers userid and password as the input
	public boolean userProfile(String userId, String password) {
		return true;
	}
	
	
	
	public static void main(String[] args) {}
}
