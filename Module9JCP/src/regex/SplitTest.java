package regex;

public class SplitTest {

	public static void main(String[] args) {
		String s = "abc.cde.fg";
		String[] tokens = s.split("\\."); //single point . means all characters
		for(String token: tokens){
			System.out.println(token);
		}

	}

}
