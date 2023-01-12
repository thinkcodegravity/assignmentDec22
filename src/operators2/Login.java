package operators2;

public class Login {
	private String registerUserid = "ajit";
	private String password = "codeGravity";
	
	public void login(String loginUserId, String loginPassword) {
		if(this.registerUserid == loginUserId && this.password == loginPassword) {
			System.out.println("Login success");
		}
		else
			System.out.println("Login failed!");
	}
}
