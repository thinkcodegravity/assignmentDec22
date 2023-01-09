package scope;

public class Amazon {

	private String userID = "ajit.shukla@gmail.com";
	private String password = "Password123";
	private int age;
	
	public boolean changePassword(String userID, String oldPassword, String newPassword)
	{
		if(this.userID == userID && this.password == oldPassword)
			this.password = newPassword;
		return this.password == newPassword;
	}
}
