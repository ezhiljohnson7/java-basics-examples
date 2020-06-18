package constructor;

public class Zoo {

	public static void main(String[] args) {

		Animal animalObj1 = new Animal();
		System.out.println("animalObj1 --> animalName --> " + animalObj1.getAnimalName());
		System.out.println("animalObj1 --> animalAge --> " + animalObj1.getAnimalAge());
		
		Animal animalObj2 = new Animal("CAT");
		System.out.println("animalObj2 --> animalName --> " + animalObj2.getAnimalName());
		System.out.println("animalObj2 --> animalAge --> " + animalObj2.getAnimalAge());
		
		Animal animalObj3 = new Animal("LION", 10);
		System.out.println("animalObj3 --> animalName --> " + animalObj3.getAnimalName());
		System.out.println("animalObj3 --> animalAge --> " + animalObj3.getAnimalAge());
	}
}
