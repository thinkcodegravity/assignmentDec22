package methods;

public class User {

	String name;
	String dateOfBirth;
	long phoneNumber;
	String address;
	String userID;
	String password;
	
	
	public User profile(String userID, String pass)
	{
		if(this.userID == userID && this.password == pass)
			return null;
	
	return null;
	}
}