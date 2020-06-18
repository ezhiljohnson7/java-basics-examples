package polymorphism.overriding;

public class ClassC extends ClassB{

	public static void main(String[] args) {
		
		mySchoolName();

		System.out.println("I'm from Class-C");
		
		myClassStrength();
	}
	
	public static void myClassStrength() {
		
		System.out.println("My class contains 30 members");
	}
}
