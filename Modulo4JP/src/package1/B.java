package package1;

public class B {
	private char b;

	private B(char b) {
		super();
		this.b = b;
	}

	public char getB() {
		return b;
	}

	public void setB(char b) {
		this.b = b;
	}
	
	public static void main(String...argy){
		A a1 = new A();
		a1.setA('a');
		System.out.println(a1.a);
		
		A a2 = new A('b');
		System.out.println(a2.getA());
		
		B b = new B('a');
		System.out.println(A.b);
		System.out.println(a1.b);
		System.out.println(a2.b);
	}
}
