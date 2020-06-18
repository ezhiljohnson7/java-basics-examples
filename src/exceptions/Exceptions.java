package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//Exception handling -> Throwable -> Exception -> known(Checked) exceptions and unknown(unchecked) exceptions
// Checked exception example -> IOException, FileNotFoundException, etc.,
// Unchecked exceptions example -> NullPointer, RUNTIMEException, etc

public class Exceptions {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		boolean isFileReadable = false;

		try {
			FileInputStream file = new FileInputStream("./Notes1.txt");
			System.out.println(file.read());
			isFileReadable = true;
		} catch(FileNotFoundException fnfe) {
//			fnfe.printStackTrace();
		} catch(IOException ioe) {
//			ioe.printStackTrace();
		} finally {
			if(isFileReadable) {
				System.out.println("Able to read the file");
			} else {
				System.out.println("Unable to read the file");
			}
		}
	}

}

