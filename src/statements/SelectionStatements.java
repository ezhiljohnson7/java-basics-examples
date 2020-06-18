package statements;

public class SelectionStatements {

	public static void main(String[] args) {

		SelectionStatements selectObj = new SelectionStatements();
		
		System.out.println(selectObj.getAnimalSound("CAT"));
		System.out.println(selectObj.getAnimalSound("PIG"));
		System.out.println(selectObj.getAnimalSound("DOG"));
		System.out.println(selectObj.getAnimalSound("LION"));
		
		System.out.println(selectObj.getAnimalSoundWithSwitch("CAT"));
		System.out.println(selectObj.getAnimalSoundWithSwitch("PIG"));
		System.out.println(selectObj.getAnimalSoundWithSwitch("DOG"));
		System.out.println(selectObj.getAnimalSoundWithSwitch("LION"));
	}
	
	public String getAnimalSound(String animalName) {
		
		if(animalName.equals("DOG")) {
			return "BOW";
		} else if(animalName.equals("CAT")) {
			return "MEOW";
		} else if(animalName.equals("PIG")) {
			return "HOINK";
		} else {
			return "Animal sound not found..!";
		}
//		return "Animal sound not found..!";
	}
	
	public String getAnimalSoundWithSwitch(String animalName) {
		
		switch(animalName) {
		
		case "DOG" : 
			return "BOW";
		case "CAT" : 
			return "MEOW";
		case "PIG" : 
			return "HOINK";
		default :
			return "Animal sound not found..!";
		}
	}

}
