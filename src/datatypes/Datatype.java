package datatypes;

import java.math.BigInteger;

public class Datatype {
	
	//Non-primitive
	static String name = "ABC";
	
	static String[] allNames = {"ABC","DEF","GHI"};
	
//	String[] allNames2 = new String[3];//what is new?
//	allNames[0] = "ABC";
//	allNames[1] = "DEF";
//	allNames[2] = "GHI";
	
	//Primitive
	static char initial = 'X';
	static int age = 2122222222;
	static double height = 6.1;
	static long mobileNumber = 987654321;//919876543210
	static boolean isIndian = true;
	static short fatherAge = 21222;
	
//	static byte data = //arrays
//	static BigInteger mobileNumber1 = (BigInteger) 919876543210; explain cast.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Customers name is : " + initial +"."+ name);
		System.out.println("Customers age is : " + age);
		System.out.println("Customers height is : " + height);
	}
}
