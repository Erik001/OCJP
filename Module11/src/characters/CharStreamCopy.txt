package characters;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamCopy {

	public static void main(String[] args) {
		char[] c = new char[200];
		int cLenght = c.length;
		try (FileReader fr = new FileReader(
				"C:/Users/torrer02/Documents/workspace-sts-3.7.2.RELEASE/Module11/src/characters/CharStreamCopy.java");
				FileWriter fw = new FileWriter(
						"C:/Users/torrer02/Documents/workspace-sts-3.7.2.RELEASE/Module11/src/characters/CharStreamCopy.txt")) {
			int read = 0;
			while ((read = fr.read(c)) != -1) {
				if (read < cLenght) {
					fw.write(c, 0, read);
				} else {
					fw.write(c);
				}
				
				for(char d: c){
					System.out.print(d);
				}
			}
		} catch (IOException io) {
			io.printStackTrace();
		}

	}

}
