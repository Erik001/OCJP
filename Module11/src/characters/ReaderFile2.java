package characters;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderFile2 {

	public static void main(String[] args) {
		String fileName1 = "c:\\Libraries\\myfile.txt";
		String fileName2 = "c:\\Libraries\\newfile.txt";

		try (BufferedReader buffIn = new BufferedReader(new FileReader(fileName1));
				BufferedWriter buffOut = new BufferedWriter(new FileWriter(fileName2));) {
			String line = "";
			int count = 1;
			line = buffIn.readLine();
			while(line != null){
				buffOut.write(count + ":" + line);
				buffOut.newLine();
				count++;
				line = buffIn.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
