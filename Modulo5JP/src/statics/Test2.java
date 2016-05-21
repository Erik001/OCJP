package statics;

public class Test2 {
	
	static String[] arr;
	
	static{
		System.out.println("esto se ejecuta una sola vez");
		arr = new String[]{"1","2","3"};
	}
	
	{
		System.out.println("1....se ejecuta cuando se genera la instancia");
	}

	public Test2() {
		System.out.println("2....se ejecuta cuando se genera la instancia");
	}
	
	public static void main(String...argy){
		new Test2();
		new Test2();
		new Test2();
	}
	

}
