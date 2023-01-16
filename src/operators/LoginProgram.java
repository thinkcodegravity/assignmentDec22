package operators;

/*
Create login program
(has-a)Declare global variable registerUserid and register password
Create login method that takes loginUserid and login password
Print if login is success or failed
 */

public class LoginProgram {
	//global var registerUserid, registerPass
	static String registerUserid= "abc";
	static String registerPass="abc123";
	
	//login method taking loginUserid and login password
	static String loginResult(String loginUserid, String loginPass) {
		String result=" ";
		if(registerUserid == loginUserid && registerPass==loginPass) {
			result="login Pass";
		}else {
			result="login Fail";
		}
		System.out.println(result);
		return result;
	}
	
	public static void main(String[] args) {
		loginResult("abcd", "abc123");
		
	}

}
