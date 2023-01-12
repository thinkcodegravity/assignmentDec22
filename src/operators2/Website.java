package operators2;

public class Website {
	private String existingUserID = "ajit";
	
	public void register(String userid, String password) {
		if(this.existingUserID == userid) {
			System.out.println("UserID already exists. Registration failed");
		}
		else
			System.out.println("Registration success.");
	}
}
