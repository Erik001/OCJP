package genericstest.generico;
//Implementar ListIterable

import collectionspractices.sets.Moof;
import collectionspractices.sorted.MyDate;

public class TestMyArrayList {

	public static void main(String[] args) {
		MyArrayList ml = new MyArrayList();
		ml.add(new Moof(6));
		ml.add(new MyDate(5, 3, 2016));
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
