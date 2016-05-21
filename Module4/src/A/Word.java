package A;

public class Word {

	private Word(int lenght) {
	
	}
	
	public Word(String w){
		
	}

}

class Buzzword extends Word{
	public Buzzword(){
		
		super("Buzzword");
		//super(100); BAD
		//this("Buzzword"); //OK
		//this(); //	Recursive constructor invocation Buzzword()

		
	}
	
	public Buzzword(String w){
		super(w);
	}
}
