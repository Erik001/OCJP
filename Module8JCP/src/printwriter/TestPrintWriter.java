package printwriter;

import java.io.PrintWriter;

public class TestPrintWriter {

	public static void main(String[] args) {
		PrintWriter pw = new PrintWriter(System.out, true);
		pw.print("esto es un ejemplo");
		pw.println(" del PrintWriter en consola");

	}

}
