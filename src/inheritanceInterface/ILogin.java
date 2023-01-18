package inheritanceInterface;
/*
Write a program for ILogin interface .Create abstract methods.
Register method that return register is success or failure
 		takes input userid and password and email
Login method that return login is success or failure
		takes input userid and password
Change password method that return change is success or failure
		takes input userid and newpassword

 */
public interface ILogin {
	
	abstract void register(int userid, String email, String password);
	abstract void login(int userid, String password);
	abstract void changePass(int userid, String newPassword);

}
