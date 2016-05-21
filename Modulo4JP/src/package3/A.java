package package3;

public class A {
	public A(){
		this(2);
		System.out.println("1.2");
	}

	private A(int i) {
		System.out.println("1.1");
	}
}

class B extends A{
	public B(){
		//super(3); --- Not possible is private
		super();
		System.out.println("2.0");
	}
}

class C extends B{
	public C(){
		System.out.println("3.0");
	}
	
	public static void main(String...arf){
		new C();
	}
}