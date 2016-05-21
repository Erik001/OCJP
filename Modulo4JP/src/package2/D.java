package package2;

import package1.A;

public class D extends A {
	private char d;
	
	
	public char getD() {
		super.a = 'n';
		super.b = 'm';
		A.b = 'n'; //Correct way to access the variable
		super.setA('a');
		return d;
	}


	public void setD(char d) {
		this.d = d;
		this.setA('v');
	}


	public static void main(String[] args) {
		//A a = new A(); error is not visible, at instance level
		A a1 = new A('a');
		//a1.setA('a');
		//a1.a = 's';
		D d = new D();
		d.a = 48;
		
	}
	
	public D(){
		super();
	}

}
