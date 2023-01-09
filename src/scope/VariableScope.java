package scope;

public class VariableScope {

	public int vin;
	String type;
	
		
	}

 public class Car{
	 public static void main(String[] args) {
	
		VariableScope f=new VariableScope();
		f.vin=123;
		f.type="Jeep";
		
		System.out.println(f.vin);
		System.out.println(f.type);
		}
	 
 }
	 
	 

