package characters;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStreamCopy2 {

	public static void main(String[] args) {
		try (BufferedReader buffInput = new BufferedReader(new FileReader("file.txt"));
				BufferedWriter buffOutput = new BufferedWriter(new FileWriter("file_copy.txt"))) {
			String line = "";
			while((line = buffInput.readLine()) != null){
				buffInput.skip(3);
				buffOutput.write(line);
				buffOutput.newLine();
			}
		} catch (IOException io) {
			io.printStackTrace();
		}
	}

}
