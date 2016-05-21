package characters;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStreamCopy {

	public static void main(String[] args) {
		try (BufferedReader buffInput = new BufferedReader(new FileReader("file.txt"));
				BufferedWriter buffOutput = new BufferedWriter(new FileWriter("file_copy.txt"))) {
			String line = "";
			System.out.println(buffInput.readLine());
			buffInput.mark(0);
			System.out.println(buffInput.readLine());
			System.out.println(buffInput.readLine());
			buffInput.reset();
			System.out.println(buffInput.readLine());
			buffInput.reset();
			System.out.println(buffInput.readLine());
			buffInput.mark(0);
			System.out.println(buffInput.readLine());
			buffInput.reset();
			System.out.println(buffInput.readLine());
			System.out.println(buffInput.readLine());
			System.out.println(buffInput.readLine());
			System.out.println(buffInput.readLine());
			System.out.println(buffInput.readLine());
			System.out.println(buffInput.readLine());
			System.out.println("********************************************************");
			/*buffInput.mark(0);
			System.out.println(buffInput.readLine());
			buffInput.reset();*/
			int i = 0;
			while(true){
				buffInput.mark(i++);
				System.out.println(buffInput.readLine());
				System.out.println("i :: " + i++);
				buffInput.reset();
			}
		} catch (IOException io) {
			io.printStackTrace();
		}
	}

}
