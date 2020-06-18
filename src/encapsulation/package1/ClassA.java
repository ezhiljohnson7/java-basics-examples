package encapsulation.package1;

public class ClassA {

	public static void main(String[] args) {
		
		ClassB.register();
		
		login();
		
		ClassB.createEmail();
		
		ClassB.sendEmail();
	}
	
	private static void login() {
		
		System.out.println("My Login implementation is successful");
	}

}
