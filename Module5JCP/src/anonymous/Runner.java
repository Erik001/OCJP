package anonymous;

public class Runner {
	public static String name = "Unknown";
	
	public void start(){
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		name = "Danile";
		//start(); BAD Static calling a non static method

	}
}


