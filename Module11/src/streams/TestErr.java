package streams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class TestErr {

	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("error.txt");
			System.setErr(new PrintStream(os));
			System.setOut(new PrintStream(os));
			System.err.println("Error");
			System.out.println("out");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}

	}

}
