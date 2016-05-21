package regex;

public class StringSplit01 {

	public static void main(String[] args) {
		//String names = "John-.(George-.$Paul-.8Ringo";
		//String[] result = names.split("-..");
		String names = "John-.-George-.-Paul-.-Ringo";
		String[] result = names.split("-.-");
		for (String aux: result){
			System.out.println(aux);
		}

	}

}
