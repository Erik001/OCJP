package exceptions;

public class InvalidAgeException2 extends IllegalArgumentException {

	

}

class Tracker{
	
	void verify(int age){
		if (age < 12)
			throw new InvalidAgeException2();
		else if(age >= 12 && age < 60)
			System.out.println("General category");
	}
	
	public static void main(String[] args) {
		int age = Integer.parseInt(args[1]);
		try{
			new Tracker().verify(age);
		}catch(Exception e){
			System.out.println(e.getClass());
		}

	}
}
