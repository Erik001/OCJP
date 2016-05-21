package genericstest.generico;

import collectionspractices.sets.Moof;
import collectionspractices.sorted.MyDate;



public class TestMyArrayListGen {

	public static void main(String[] args) {
		MyArrayListGeneric<String> ml = new MyArrayListGeneric<>();
		//ml.add(new Moof(6));
		//ml.add(new MyDate(5, 3, 2016));
		ml.add("Hola My Array List");
		ml.add("Hola Mundo");
		ml.add("Hola You");
		System.out.println(ml);

		System.out.println("-------------------------------------------");

		for (Object o : ml) {
			System.out.println(o);
		}

		System.out.println("-------------------------------------------");

		for (Object o : ml) {
			System.out.println(o);
		}

	}

}
