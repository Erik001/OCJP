package virtualmethods;

public class Cake {

	public static void main(String[] args) {
		Frosting a = new Frosting();
		Cake b = new Elephant();
		a.print();
		((Cake)b).print();
	}
	
	void print(){
		System.out.print(this.getClass().toString() + ": ");
	}

}

class Frosting extends Cake{
	void print(){
		super.print();
		System.out.println("This is frosting");
	}
}

class Elephant extends Frosting{
	void print(){
		super.print();
		System.out.println("This is not an elephant");
	}
}