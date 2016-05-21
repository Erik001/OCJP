package anonymous;

public class A2 {

	int a = 5;
	
	String doA(){
		return "a1";
	}
	
	protected static String doA2(){
		return "a2";
	}

}

class B2 extends A2{
	
	int a = 7;
	
	String doA(){
		return "b1";
	}
	
	protected static String doA2(){
		return "b2";
	}
	
	void go(){
		A2 myA = new B2();
		System.out.println(myA.doA() + myA.doA2() + myA.a);
	}
	
	public static void main(String[] args) {
		new B2().go();

	}
}
