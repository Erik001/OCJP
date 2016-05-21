package exceptions;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestFile2 {

	public static void main(String[] args) {
		try (FileReader fis = new FileReader(args[0]);
				BufferedReader buffInput = new BufferedReader(fis);
				FileWriter fos = new FileWriter(args[1]);
				BufferedWriter buffWriter = new BufferedWriter(fos);
				//		String ca = "hola"; BAD is not a closable
				
				) {
				String line;
				while((line = buffInput.readLine()) != null){
					System.out.println(line);
					buffWriter.write(line);
					buffWriter.newLine();
				}
		} catch (IOException io) {
			System.out.println(io.getMessage());
		}

	}

}
