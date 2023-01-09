package methodsRef;

public class Program {
public static void main(String[] args) {
	MethodRef mr = new MethodRef();
	Person p = new Person();
	int x = 3;
	mr.method1(p, x);
	System.out.println(x);
	System.out.println(p.name);
}
}
