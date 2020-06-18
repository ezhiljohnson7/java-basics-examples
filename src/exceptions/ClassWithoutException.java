package exceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class ClassWithoutException {

	public static void main(String[] args) throws IOException  {
		
		boolean isFileReadable = false;

		FileInputStream file = new FileInputStream("./Notes1.txt");
		System.out.println(file.read());
		isFileReadable = true;
		
		if(isFileReadable) {
			System.out.println("Able to read the file");
		} else {
			System.out.println("Unable to read the file");
		}

	}

}
