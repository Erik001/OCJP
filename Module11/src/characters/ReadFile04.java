package characters;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile04 {

	public static void main(String[] args) {
		try(BufferedReader buffIn = new BufferedReader(new FileReader("c:\\Libraries\\myfile.txt"))){
			String line = "";
			int count = 1;
			buffIn.mark(1);
			line = buffIn.readLine();
			System.out.println(count + ": " + line);
			line = buffIn.readLine();
			count++;
			System.out.println(count + ": " + line);
			buffIn.reset();
			line = buffIn.readLine();
			count++;
			System.out.println(count + ": " + line);
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException");
		} catch (IOException e) {
			System.out.println("IOException");
		}

	}

}
