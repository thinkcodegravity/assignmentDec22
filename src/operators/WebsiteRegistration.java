package operators;

/*
Create website program
(has-a)Declare global variable existingUserid 
Create register method that takes new registeration userid and password
Based on If exsting userid matches new registeration id then registration fails
 else registeration method print success or failure.

 */

public class WebsiteRegistration {
	//global var registerUserid, registerPass
	static String existingUserid= "abc";
	
	//login method taking loginUserid and loginpassword
	static String registrationResult(String loginUserid, String loginPass) {
		String result=" ";
		if(loginUserid !=existingUserid) {
			result="Registration Successful";
		}else {
			result="Registration Fail";
		}
		System.out.println(result);
		return result;
	}
	
	public static void main(String[] args) {
		registrationResult("abcd", "abc123");
		
	}

}
