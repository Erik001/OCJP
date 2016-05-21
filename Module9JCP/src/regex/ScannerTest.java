package regex;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(args[0]);
		Scanner s2 = new Scanner(args[0]);
		s1.useDelimiter(args[1]);
		s2.useDelimiter(args[1]);
		while(s1.hasNext()){
			String s = s1.next();
			System.out.println(s);
		}
		
		System.out.println(s2.next());
		System.out.println(s2.nextInt());
		System.out.println(s2.next());
		System.out.println(s2.nextBoolean());

	}

}
