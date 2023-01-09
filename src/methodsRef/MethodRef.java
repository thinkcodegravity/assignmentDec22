package methodsRef;

public class MethodRef {
	public void method1(Person p1, int a) {
		method2(p1,a);
		p1.name = "Ajit";
		a = 10;
		
	}
	
	public void method2(Person p2, int b) {
		p2.name = "Mike";
		b = 20;
		method3(p2,b);
	}
	
	public void method3(Person p3, int c) {
		p3 = new Person();
		p3.name = "Ajit";
		c = 30;
	}
}
