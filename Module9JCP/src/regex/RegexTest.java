package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
	public static void main(String[] args) {
		String[][] expresiones = { { "asd#ab$ch0f9gab_ki", "." }, { "asdabchfgabcki", "abc" },
				{ "asda#chbfga-cki", "[a-c]" }, { "asda#chfga-cki", "[^a-c]" }, { "aida#chfga-cki", "[a-c]|[f-i]" },
				{ "It was the best of times", "w.s" }, { "It was the wcsbest of times", "w[abc]s" },
				{ "It was the best of times", "t[^aeo]mes" },
				{ "Jo told me 20 ways to San Jose in 15 minutes.", "\\d\\d" },
				{ "Jo told me 20 ways to San Jose in 15 minutes.", "\\sin\\s" },
				{ "Jo told me 20 ways to San Jose in 15 minutes.", "\\Sin\\S" },
				{ "Longlonglong ago, in a galaxy far far away", "ago.*" },
				{ "Longlonglong ago, in a galaxy far far away", "gal.{3}" },
				{ "Longlonglong ago, in a galaxy far far away", "(long){2}" },
				{ "Longlonglong ago, in a galaxy far far away", "[long]{2}" },
				{ "it was the best of times or it was the worst of times", "it.*?times" },
				{ "it was the best of times or it was the worst of times", "^it.*?times" },
				{ "it was the best of times or it was the worst of times", "\\sit.*?times$" },
				{ "it was the best of times or it was the worst of times", "it.*?times" },
				{ "it was the best of times or it was the worst of times", "it.*?times$" },
				{ "it was the best of times or it was the worst oftimes", "\\bti.es" },
				{ "it wasthe best of times or it was theworst of timesth", "the\\b" }

		};
		for (int i = 0; i < expresiones.length; i++) {
			System.out.println("***********************************");
			Pattern p = Pattern.compile(expresiones[i][1]);
			Matcher m = p.matcher(expresiones[i][0]);
			System.out.println("Source: " + expresiones[i][0]);
			System.out.println(" Index: 0123456789012345678901234567890123456789");
			System.out.println("Expression: " + m.pattern());
			System.out.print("Match Positions: ");
			while (m.find()) {
				System.out.print(m.start() + " ");
			}
			System.out.println("\nFound:");
			int j = 1;
			m.reset();
			while (m.find()) {
				System.out.println((j++) + ": " + m.group());
			}
		}
		String header = "<h> un texto </h>";
		Pattern p = Pattern.compile("h");
		Matcher m = p.matcher(header);
		int j = 1;
		m.reset();
		
		while (m.find()) {
			System.out.println((j++) + ": " + m.group());
			header = m.replaceAll("p");
			System.out.println(header);
		}
	}
}