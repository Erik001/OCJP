package regex;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		String source = args[0];
		StringTokenizer tokenizer = new StringTokenizer(source, args[1]);
		while(tokenizer.hasMoreElements()){
			System.out.println(tokenizer.nextToken());
		}

	}

}
