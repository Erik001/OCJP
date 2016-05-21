package a;

interface Evento{
	String type = "Evento";
	
	public void details();
}

class Quiz{
	private String type = "Quiz";
	//String type = "Quiz"; provokes compilation error for ambiguous fild type
}

public class PracticeQuiz extends Quiz implements Evento{

	
	public static void main(String[] args) {
		new PracticeQuiz().details();
		System.out.print(" " + type);

	}

	@Override
	public void details() {
		System.out.print(type);
		
	}

}
