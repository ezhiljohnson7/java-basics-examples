package classes.classexamples;

public class ClassA extends AbstractClass{
	
		public static void main(String[] args) {
			
			ClassA classaObj = new ClassA();
			classaObj.mySchoolName();
			
			mySchoolType();
			
			System.out.println("I'm from Class-A");
		}

		@Override
		public void myClassStrength() {
			
			System.out.println("My class strength is 20");
		}

		@Override
		public void noOfBoys() {
			
		}

		@Override
		public void noOfGirls() {
			
			System.out.println("My girls strength is 20");
		}

		@Override
		public void noOfComputers() {
			// TODO Auto-generated method stub
			
		}
		
		public static void noOfResources() {
			//
		}
}
