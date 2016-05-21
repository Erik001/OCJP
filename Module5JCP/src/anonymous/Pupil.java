package anonymous;

public class Pupil {
	static String name = "unknown";
	//String name = "unknown"; even static or not static always gonna print unknown unknown 
	
	public String getName(){
		return name;
	}

}

class John extends Pupil{
	static String name = "Jhon";
}

class Harry extends Pupil{
	String name = "Harry";
	
	//public static String getName(){ BAD static method cannot hide instance method
	public String getName(){
		return name;
	}
}

class Director{
	public static void main(String[] args) {
		Pupil p1 = new John();
		Pupil p2 = new Harry();
		System.out.print(p1.name + " ");
		System.out.print(p2.name + " ");

	}
}