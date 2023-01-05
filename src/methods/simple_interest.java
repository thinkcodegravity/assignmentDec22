package methods;

public class simple_interest {

public static float SI(float p, float t, float r) {
		
		float amount = (p*t*r)/100;
		return amount;
}
	
	public static void main(String args[]) {

		float result = SI(1000,2,1.5f);
		System.out.println(result);

	}
}
