package nonstatic;

public class Calculator {

	int value = 3;
	final int CONSTANT = 7;
	
	public static void main(String[] args) {
		
		Calculator calcObject = new Calculator();
		
		System.out.println("Sum is : " + calcObject.add(5.5, calcObject.CONSTANT));
		System.out.println("Difference is : " + calcObject.subtract(10, 5));
		System.out.println("Product is : " + calcObject.mulitply(9, 3));
		System.out.println("Quotient is : " + calcObject.divide(9, 3));
		
		
		
		
		
		
		//
		
		
		//
	}
	
	public double add(double a, double b) {
		double sum = a + b;
		return sum;
	}

	public int subtract(int a, int b) {
		int diff = a - b;
		return diff;
	}

	public int mulitply(int a, int b) {
		int product = a * b;
		return product;
	}

	public int divide(int a, int b) {
		int quotient = a / b;
		return quotient;
	}

}
