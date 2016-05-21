package collectionspractices.sets;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		//TreeSet ocupa Comparable para poder comparar y deben ser mismo tipo de objetos
		//TreeSet ordena de forma ascendente números, texto es ascii y alfabeto, fechas cronológico ascendente
		//Set set = new TreeSet();
		SortedSet<Integer> set = new TreeSet<>(); //en java 7 se puede dejar vacio <> el operado diamante
		//set.add(new Moof(3)); si Moof no implementa Comparable manda error
		//set.add(new Moof(8));
		set.add(4);
		set.add(100);
		set.add(8);
		set.add(78);
		set.add(5);
		///[4, 5, 8, 78, 100]
		
		Set s = set;
		//s.add("23323"); //java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
		
		//set.add("Hola Mundo"); // java.lang.ClassCastException:
		System.out.println(set);

	}

}
