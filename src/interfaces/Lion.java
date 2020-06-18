package interfaces;

public class Lion implements WildAnimal, Animal{

	@Override
	public void getAnimalName() {
		// TODO Auto-generated method stub
		
		System.out.println("LION");
	}

	@Override
	public void getAnimalPlaceOfOrigin() {
		// TODO Auto-generated method stub
		System.out.println("Africa");
	}

	@Override
	public void getAnimalAge() {
		// TODO Auto-generated method stub
		
		System.out.println("10");
	}

	@Override
	public void favoriteAnimal() {
		// TODO Auto-generated method stub
		
		System.out.println("Deer");
	}
	
	public static void main(String... args) {
		
		Animal animalObj = new Lion();
		animalObj.getAnimalName();
		animalObj.getAnimalPlaceOfOrigin();
		animalObj.getAnimalAge();
//		animalObj.favoriteAnimal();
		
	}

}
