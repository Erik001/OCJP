package package2;

import package1.A;
import package1.B;

public class C {
	private char c;

	private C(char c) {
		super();
		this.c = c;
	}

	public char getC() {
		return c;
	}

	public void setC(char c) {
		this.c = c;
	}
	
	public static void main(String[] args){
		//A a = new A();  error, A has a protected constructor
		//B b = new B('b'); error, B constructors is private
		//System.out.println(A.b= 'b'); error default access level, only classes in the same package can access the variable
	}
	
}
