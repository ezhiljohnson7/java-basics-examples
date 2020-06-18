package constructor;

public class Animal {
	
	String name;
	int age;
	
	//Any-time 'new' object of Animal is invoked the below is auto-generated
	public Animal() {
		
		new Animal("DOG", 0);
	}
	
	public Animal(String animalName) {
		name = animalName;
		age = 0;
	}
	
	public Animal(String animalName, int animalAge) {
		name = animalName;
		age = animalAge;
	}
	
	public String getAnimalName() {
		
		return name;
	}
	
	public int getAnimalAge() {
		
		return age;
	}
}
