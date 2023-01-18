package inheritanceInterface;

//Write a program Login class that implements Ilogin
//Write the code for all abstract methods (just sysout is fine)

public class Login implements ILogin{
	public void register(int userid, String email, String password) {
		System.out.println("Register method");
	}
	public void login(int userid, String password) {
		System.out.println("login method");
	}
	public void changePass(int userid, String newPassword) {
		System.out.println("changePassword method");
	}
	
	public static void main(String[] args) {
		
		Login l= new Login();
		l.register(123,"", " ");
		l.login(123,"");
		l.changePass(123, " ");
		

	}
	

}
