package abstraction;

public class ClassA {

	public static void main(String[] args) {
		
		ClassB.register();
		
		ClassB.login();
		
		ClassB.createEmail();
		
		ClassB.sendEmail();
	}

}
