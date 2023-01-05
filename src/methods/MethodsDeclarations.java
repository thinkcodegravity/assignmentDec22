package methods;

public class MethodsDeclarations {

	public static void main(String[] args) {
		System.out.println("Assignments here");
	}
	//Focus only on method declaration and include proper return statements. No logic required.
			//Create a method that can accept appropriate input for payment webpage and returns payment response.
	public boolean payment(long creditNumber,int secCode, String expDate ) {
		return true;
	}
			//Create a method that can process registration
	public boolean register(String name, String address,long phoneNumber ) {
		return true;
	}
			//Create a method that can accept product input and calculate total cart value
	//Product program has quantity and price
	public int product (int quantity,double price) {
		return 40;
	}
		
			//Create a method that can calculate area of rectangle
	public 	float 	areaOfRectangle(  float  length , float width ){				
		return 6.0f;					
	}						
			//Create a method that can calculate simple interest
	public 	float 	calculateSimpleInterest ( float principal, short term, float interest  )	{
	return 3;	
	}				
			//Create a method that can process withdraw from bank account
	public boolean withdraw(int amount) {
		return false;
	}
			//Create a method that can process deposit from bank account
	public int deposit(int amount) {
		return 100;
	}
			//Create a method that can return electricity plan details if provided zip code as the input
	public double electricityPlan(int zipCode) {
		return 35.58;
	}
			//Create a method that can return insurance detail if provided input as age.
	public boolean insurance(int age) {
		return true;
	}
			//Create a method that can return total amount if input provided is product price and discount percentage.
	public int toatalAmount(float price,int discountPercent) {
		return 50;
	}
			//Create a method that can return user profile if provided customers userid and password as the input
public boolean userProfile(String userid,String password) {
	return true;
}

}
