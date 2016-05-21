package characters;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteTest {

	public static void main(String[] args) {
		//try(FileWriter w = new FileWriter("c:\\Libraries\\newfile.txt");){ replaces the text
		try(FileWriter w = new FileWriter("c:\\Libraries\\newfile.txt",true);){ //appends the text at the end of the file
			w.append("Java 7");
		}
 catch (IOException e) {
			e.printStackTrace();
		}

	}

}
