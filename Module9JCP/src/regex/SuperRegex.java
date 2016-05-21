package regex;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SuperRegex {

	public static void main(String[] args) {
		Properties myProp = new Properties();

		try {
			FileInputStream fis = new FileInputStream("regex.properties");
			myProp.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Set set = myProp.keySet();
		for (Object key : set) {
			Pattern p = Pattern.compile(myProp.getProperty((String) key));
			Matcher m = p.matcher((String) key);
			System.out.println("Source: " + key);
			System.out.println(" Index: 012345678901234567890012345678901234567890" + key);
			System.out.println("Expression: " + m.pattern());
			while (m.find()) {
				System.out.print(m.start() + " ");
			}
			System.out.println("\n-----------------------------------------------------");
		}

	}

}
