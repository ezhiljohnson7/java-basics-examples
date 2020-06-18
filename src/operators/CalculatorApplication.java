package operators;

public class CalculatorApplication {
	
	static final int value = 3;
	static final int CONSTANT = 7;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int sum1 = add(5, 7);
//		int sum2 = add(sum1, 7);
//		int sum3 = add(sum2, 7);
//		int sum4 = add(sum3, 7);

		System.out.println("Sum is : " + add(5, CONSTANT));
		System.out.println("Difference is : " + subtract(10, 5));
		System.out.println("Product is : " + mulitply(9, 3));
		System.out.println("Quotient is : " + divide(9, 3));
	}

	public static int add(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public static int subtract(int a, int b) {
		int diff = a - b;
		return diff;
	}

	public static int mulitply(int a, int b) {
		int product = a * b;
		return product;
	}

	public static int divide(int a, int b) {
		int quotient = a / b;
		return quotient;
	}

}
