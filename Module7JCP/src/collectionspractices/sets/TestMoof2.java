package collectionspractices.sets;

import java.util.LinkedHashSet;
import java.util.Set;

public class TestMoof2 {

	public static void main(String[] args) {
		//LinkedHashSet set = new LinkedHashSet();
		Set set = new LinkedHashSet();
		//toda que ocupe la palabra Hash debe implementar el método equals y hashCode
		//Solo TreeSet asegura orden en los elementos
		set.add(new Moof(5));
		set.add(new Moof(7));
		set.add(new Moof(1));
		set.add(new Moof(4));
		set.add(new Moof(5));
		set.add(new Moof(4));
		set.add(new StringBuilder("Hola"));
		set.add(new StringBuilder("Hola").toString());
		set.add(9);
		set.add(9);
		set.add(9);
		set.add("Hola");
		set.add(new String("Hola"));
		System.out.println(set);
	}

}
