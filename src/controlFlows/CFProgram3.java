package controlFlows;
/*
Write a program that has-a registered phone, userid, password
Create a method to retrieve userid. That will take input as phone 
	if phone matches registered phone return userid.
Create a method to retrieve password. That will take input as userid
	if userid matches registered userid return password.
 */

public class CFProgram3 {
	long registeredPhone=123;
	String userid="abc";
	String password="123";
	

	String retrieveId(long phone) {
		if(phone==registeredPhone) {
			return userid;
		}else {
			return "Phones Dont Match";
		}
	}
	String retrievePass(String id) {
		if(id==userid) {
			return password;
		}else {
			return "IDs dont match ";
		}
	}
	

	public static void main(String[] args) {
		CFProgram3 cfp3= new CFProgram3();
		
		System.out.println(cfp3.retrieveId(123));
		System.out.println(cfp3.retrievePass("abc"));
		
	}

}
