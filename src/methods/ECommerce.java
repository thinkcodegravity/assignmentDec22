package methods;

public class ECommerce {
	
	
	public float totalAmount(float price, float discountPercent)
	{
		return (price - price*discountPercent/100);
	}
	
	public float cartValue(int quantity, float price)
	{
		return quantity*price;
	}
}
