package encapsulation.package2;

import encapsulation.package1.ClassB;

public class ClassA {

	public static void main(String[] args) {
		
		register();
		
		login();
		
		ClassB.createEmail();
		
		ClassB.sendEmail();
	}
	
	private static void login() {
		
		System.out.println("My Login implementation is successful");
	}
	
	protected static void register() {
		System.out.println("My own Registration Successful");
	}
	

}
