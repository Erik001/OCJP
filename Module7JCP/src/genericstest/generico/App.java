package genericstest.generico;

import collectionspractices.sets.Moof;

public class App {
	public static void main(String... args) {
		MinMax<MyInt> m = new MinMax();
		// MinMax<VarArgs> m2 = new MinMax(); Is not a Comparable
		MinMax<Moof> m3 = new MinMax();
	}
}

class MinMax<E extends Comparable<E>> {
	E min = null;
	E max;

}

class MyInt implements Comparable<MyInt> { // Recibe su mismo tipo

	@Override
	public int compareTo(MyInt o) {
		return 0;
	}

	public <T extends C & A & B> void methodA(T aux) {

	}

}

interface A {

}

interface B {

}

class C {

}

class D{
	
}