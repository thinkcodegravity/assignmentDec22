package constructor;
/*
Write a program for products
Product has-a name,quantity,price
User can construct product 
By name
By name and price

 */

public class Problem1 {
		String name = "abc";
		int quantity= 25;
		int price= 2;
		
		Problem1(String n){
			name=n;			
		}
		
		Problem1(String n, int p){
			name=n;
			price=p;			
		}
		
	public static void main(String[] args) {
		
		Problem1 p1= new Problem1("product");
		System.out.println(p1.name);
		
		Problem1 p2= new Problem1("product1", 20);
		System.out.println(p2.name+" $"+ p2.price);

		
		
	}

}
