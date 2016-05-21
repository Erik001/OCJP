package characters;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] files) {
		if (files.length != 2) {
			System.err.println("Incorrect ayntax. Usage: Copy SrcFile DstFile");
			System.exit(-1);
		}

		String srcFile = files[0];
		String dstFile = files[1];

		try (BufferedReader inputFile = new BufferedReader(new FileReader(srcFile));
				BufferedWriter outputFile = new BufferedWriter(new FileWriter(dstFile))) {
			int ch = 0;
			inputFile.skip(6);
			while((ch = inputFile.read()) != -1){
				outputFile.write((char) ch);
			}
			
			outputFile.flush();

		} catch (FileNotFoundException e) {
			System.err.println("Error " + e.getMessage());
		} catch (IOException e) {
			System.err.println("Error " + e.getMessage());
		}
	}

}
