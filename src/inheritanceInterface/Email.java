package inheritanceInterface;
//Write a program Email class that implements INotification
//Write the code for all abstract methods (just sysout is fine)

public class Email implements INotification{

	public void sendNotification(String message) {
		System.out.println("sending notifications");
		
	}
	public static void main(String[] args) {
		Email e = new Email();
	e.sendNotification("asda");
	}

}
