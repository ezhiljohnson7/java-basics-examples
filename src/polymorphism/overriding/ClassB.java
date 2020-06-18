package polymorphism.overriding;

public class ClassB extends ClassA{

	public static void main(String[] args) {
		
		mySchoolName();
		System.out.println("I'm from Class-B");
		
		myClassStrength(2 , 5);
	}
	
	public static void myClassStrength() {
		
		System.out.println("My class contains 25 members");
	}
	
	public static void myClassStrength(int noOfAbsentees) {
		
		System.out.println("My class contains " + (25-noOfAbsentees) + " members");
	}
	
	public static void myClassStrength(int noOfAbsentees, int noOfNewComers) {
		
		System.out.println("My class contains " + (25-noOfAbsentees+noOfNewComers) + " members");
	}

}

//ClassA -> 20
//ClassB -> 25
//ClassC -> 30
