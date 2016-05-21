package nested;

public class Outer {
	private String hidden = "find me";
	public static void main(String[] args) {
		Outer me = new Outer();
		Yojimbo akira = me.new Yojimbo();
		System.out.println(akira.findYou());

	}
	
	private class Yojimbo{
		public int findYou(){
			return hidden.indexOf("me");
		}
	}

}
