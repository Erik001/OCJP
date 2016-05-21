package regex;

public class StringSplit {

	public static void main(String[] args) {
		String names = "John-.(George-.$Paul-.8Ringo";
		String[] result = names.split("-..");
		for(String str: result){
			System.out.println(str);
		}

	}

}
