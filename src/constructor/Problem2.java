package constructor;
/*
 Write a program for UserProfile
UserProfile has-a userid,password,email,phone
Can construct Userprofile
By userid and password
By email and password
By phone and password
 */

public class Problem2 {
	int userid;
	String password,email;
	long phone;
	
	Problem2(int userid, String password){
		this.userid=userid;
		this.password=password;
	}
	//cannot create 2 constructors with the same input-paramaters
	Problem2(String email,String password){
		this.email=email;
		this.password=password;
	}
	
	Problem2(long phone, String password){
		this.phone=phone;
		this.password=password;
	}
	
	public static void main(String[] args) {
		
		Problem2 p2= new Problem2(9999999999L,"password123");
		System.out.println(p2.phone);
		System.out.println(p2.password);
		
		
	}

}
