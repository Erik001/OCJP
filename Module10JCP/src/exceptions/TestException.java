package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class TestException {
//Stream bytes
//Reader or Writer Characters
	//public static void main(String[] args) throws FileNotFoundException {
	public static void main(String[] args) {
		//throw new Error();
		//throw new RuntimeException();
		try {
			throw new Throwable();
		} catch (Throwable e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			doMoreStuff();
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		}
		System.out.println("Otras Operaciones");

	}

	private static void doMoreStuff() throws FileNotFoundException {
		doStuff();
	}

	private static void doStuff() throws FileNotFoundException {
		System.out.println("About to open a file");
		InputStream in = new FileInputStream("missingFile2.txt");
		System.out.println("File open");
		try {
			in.close();
		} catch (IOException e) {
			System.err.println(e.getMessage());
			//e.printStackTrace();
		}
	}

}
