package Operators;

public class Sinterest {
	public static double famt(int p, float r, int t) {
		double famt= p*r*t/100;
		return famt;
		
		

}
	public static void main(String[] args) {
		int p= 600;
		float r= 0.9f;
		int t=5;
		double g= famt(p,r,t);
		System.out.println(g);
		
		
	}
	


}
