package collectionspractices.sets;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestTreeSet2 {

	public static void main(String[] args) {
		SortedSet<String> treeSet = new TreeSet<>();
		treeSet.add("hola mundo");
		treeSet.add("hi");
		treeSet.add("saludo");
		treeSet.add("Hola mundo");
		
		for(Iterator<String> i = treeSet.iterator();i.hasNext();System.out.println(i.next()));

	}

}
