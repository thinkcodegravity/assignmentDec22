package methods;

public class MethodRef {

	public void method1(Person p1, int a) {//method 1 declaration
		method2(p1,a); //method 2 call
		p1.name="jane"; // variable reassignment
		a=10; //variable reassignment
	}
	public void method2(Person p2, int b) {//method 2 declaration
		p2.name="mike";// variable reassignment
		b=20; //variable reassignment
		method3(p2,b); //method call
	}
	public void method3(Person p3, int c) {//method 3 declaration
		p3=new Person(); //create a new address for person
		c=30;// reassign c 
		p3.name="andy";//reassign name for p3.name
	}
}
