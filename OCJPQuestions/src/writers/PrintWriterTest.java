package writers;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterTest {

	public static void main(String[] args) {
		//PrintWriter pw = null;
		try(PrintWriter pw = new PrintWriter("File.txt")){
			
		}catch(IOException ioe){}

	}

}
