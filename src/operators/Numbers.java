package operators;

public class Numbers {
	
	// return sum of three numbers
	public float add(float num1, float num2, float num3) {
		return num1 + num2 + num3;
	}
	
	// calculate simple interest with PTR as input and return Simple Interest
	public float simpleInterest(float P, float T, float R)
	{
		float interest = (P*T*R)/100;
		return interest;
	}
	
	// return total final amount , if input provided is product price and discount percentage
	public float totalAmount(float productPrice, float discount)
	{
		return (productPrice - productPrice * discount / 100);
	}
}
