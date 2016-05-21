package regextest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyClass {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("\\bis");
		String b = "This, is, bis, is";
		Matcher m = p.matcher(b);
		while(m.find()){
			System.out.println(m.group());
		}

	}

}
