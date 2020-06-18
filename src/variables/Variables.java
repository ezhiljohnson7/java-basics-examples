package variables;

import operators.CalculatorApplication;

public class Variables {
	
	static String name = "ABC";

	public static void main(String[] args) {
		name = "XYZ";
//		String name = "XYZ";
		System.out.println(name);
		System.out.println(Variables.name);
		test1();
		
		System.out.println(CalculatorApplication.add(5, 7));
	}
	
	public static void test1() {
		 name = "abc";
		 System.out.println(name);
	}
	
}
