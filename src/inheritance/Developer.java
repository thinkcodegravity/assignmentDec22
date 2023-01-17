package inheritance;

public class Developer extends Employee{
	String jobTitle="developer";
	
	void work() {
		System.out.println("Developer works");
	}

	public static void main(String[] args) {
		
		Developer d= new Developer();
		
		d.work();
		System.out.println(d.jobTitle);
	
		

	}

}
