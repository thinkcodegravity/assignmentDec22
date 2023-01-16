package methods;

public class TestMethodReference {
	public static void main(String []args) {//start of main method
		MethodRef mr= new MethodRef();//create object of class MethodRef
		Person p= new Person();//create an object of class Person and allocate memory for it 
		int x=0;// variable declaration and initialization
		mr.method1(p,x);//method call that transfers control to method1
		System.out.println(x);//Print method call to print value of x
		System.out.println(p.name);//Print method call to print value of p.name
	}
}
/*
p = #abc
x=0
p1= #abc 
a=0
p2=#abc
b=0

#abc+ p2.name=mike
b=20;
p3=#abc
c=20
p3 =#xyz
c=30;
p3.name = andy

p1.name="jane"
a=10;
*/