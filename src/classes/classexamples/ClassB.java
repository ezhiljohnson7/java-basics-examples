package classes.classexamples;

public class ClassB extends AbstractClass{

	public static void main(String[] args) {
		
		ClassB classbObj = new ClassB();
		classbObj.mySchoolName();
		
		classbObj.myClassStrength();
	}

	@Override
	public void myClassStrength() {

		System.out.println("My class strength is 25");
	}

	@Override
	public void noOfBoys() {
		System.out.println("My class strength is 25");
		
	}

	@Override
	public void noOfGirls() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void noOfComputers() {
		// TODO Auto-generated method stub
		
	}
}
