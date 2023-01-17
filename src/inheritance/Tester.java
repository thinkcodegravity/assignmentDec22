package inheritance;

public class Tester extends Employee{
	String jobTitle="tester";
	
	void work() {
		System.out.println("Tester works");
	}

	public static void main(String[] args) {
	
		Tester t= new Tester();
		t.salary=23123;
		
		t.work();
		System.out.println(t.salary);
		System.out.println(t.jobTitle);
	
	}

}
