package exceptions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestFile {

	public static void main(String[] args) {
		FileReader input = null;
		BufferedReader buffInput = null;
		FileWriter output = null;
		BufferedWriter buffOutput = null;

		try {
			input = new FileReader(args[0]);
			buffInput = new BufferedReader(input);
			output = new FileWriter(args[1]);
			buffOutput = new BufferedWriter(output);
			String line;
			while ((line = buffInput.readLine()) != null) {
				System.out.println(line);
				buffOutput.write(line);
				buffOutput.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {

				buffOutput.close();
				output.close();
				buffInput.close();
				input.close();

			} catch (IOException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}

	}

}
