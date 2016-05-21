package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestException2 {

	public static void main(String[] args) {
		try {
			FileInputStream file = new FileInputStream("missingFile2.txt"); // File
																			// not
																			// found
			file.close();// IO Exception
		} catch (FileNotFoundException e) {
			System.out.println(e.getClass().getName());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {

		} catch (Throwable e) {

		}

	}

}
