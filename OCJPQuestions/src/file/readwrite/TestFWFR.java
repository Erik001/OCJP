package file.readwrite;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestFWFR {

	public static void main(String[] args) {
		new TestFWFR().reverseFileWithResources();
	}

	public void reverseFile() {
		List lines = new ArrayList<String>();
		BufferedReader in = null;
		BufferedWriter out = null;
		try {
			String get;
			// BufferedReader in = new BufferedReader(new
			// FileReader("C:\\Libraries\\Hola\\abc.txt"));
			in = new BufferedReader(new FileReader("C:\\Libraries\\Hola\\abc.txt"));
			while ((get = in.readLine()) != null) {
				lines.add(get);
			}

			// in.close();

			System.out.println("*************************************************************");
			System.out.println("Lines Array Size: " + lines.size());

			// BufferedWriter out = new BufferedWriter(new
			// FileWriter("C:\\Libraries\\Hola\\cba.txt"));
			out = new BufferedWriter(new FileWriter("C:\\Libraries\\Hola\\cba.txt"));
			while (lines.size() > 0) {
				String have = (String) lines.remove(lines.size() - 1);
				out.write(have + System.lineSeparator());
				// out.newLine();
			}
			// out.flush();
			// out.close();
			System.out.println("*************************************************************");
			System.out.println("Lines Array Size: " + lines.size());
		} catch (IOException ex) {
			System.out.println(ex.getClass() + " : " + ex.getMessage());
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public void reverseFileWithResources() {
		List lines = new ArrayList<String>();
		try (BufferedReader in = new BufferedReader(new FileReader("C:\\Libraries\\Hola\\abc.txt"));
				BufferedWriter out = new BufferedWriter(new FileWriter("C:\\Libraries\\Hola\\cba.txt"))) {
			String get;
			while ((get = in.readLine()) != null) {
				lines.add(get);
			}
			System.out.println("*************************************************************");
			System.out.println("Lines Array Size: " + lines.size());

			while (lines.size() > 0) {
				String have = (String) lines.remove(lines.size() - 1);
				out.write(have + System.lineSeparator());
				// out.newLine();
			}
			System.out.println("*************************************************************");
			System.out.println("Lines Array Size: " + lines.size());
		} catch (IOException ex) {
			System.out.println(ex.getClass() + " : " + ex.getMessage());
		}
	}

}
