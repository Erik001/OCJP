package collectionspractices.sorted;

import java.util.Comparator;
import java.util.TreeSet;

public class CompareTest {

	public static void main(String[] args) {
		TreeSet<String> set1 = new TreeSet<>(
				new Comparator<String>(){

					@Override
					public int compare(String o1, String o2) {
						return o1.compareTo(o2);
					}
					
				}
				);
		set1.add("pera");
		set1.add("naranja");
		set1.add("manzana");
		set1.add("uva");
		
		for(String aux: set1){
			System.out.println(aux);
		}
		

	}

}
