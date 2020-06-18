package encapsulation.package1;

public class ClassB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		login();
		register();
		createEmail();
		sendEmail();

	}
	
	private static void login() {
		System.out.println("Login Successful");
	}
	
	protected static void register() {
		System.out.println("Registration Successful");
	}
	
	public static void createEmail() {
		System.out.println("Email created successfully");
	}
	
	public static void sendEmail() {
		System.out.println("Email sent successfully");
	}

}

// Access modifiers -> public, protected and private
