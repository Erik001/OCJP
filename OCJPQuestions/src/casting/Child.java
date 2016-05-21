package casting;

public class Child {

	final int pato;

	{
		pato = 1;
	}

	private Child() {
		// pato = 0;
		{
		}

	}

	public Child(int a) {

	}

	public static void main(String[] args) {
		Child child = new Parent(1);
		Child racer = new Driver(2);

		System.out.println("child is parent, child: " + (child instanceof Parent) + " " + (child instanceof Child));
		System.out.println("racer is parent, drive, mover: " + (racer instanceof Parent) + " "
				+ (racer instanceof Driver) + " " + (racer instanceof Mover));
	}

}

class Parent extends Child {

	public Parent(int a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

}

class Driver extends Child implements Mover {

	public Driver(int a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move(int dist) {
	}

}

interface Mover {
	public void move(int dist);
}