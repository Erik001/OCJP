package collectionspractices.sets;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TestNavigableSet {

	public static void main(String[] args) {
		NavigableSet<Integer> s = new TreeSet<Integer>();
		for (int i = 606; i < 613; i++) {
			if (i % 2 == 0) {
				s.add(i);
			}
		}
		TreeSet subSet = (TreeSet) s.subSet(608, true, 611, true);
		s.add(629);
		//s.add(611);
		//subSet.add(629);//java.lang.IllegalArgumentException: key out of range
		subSet.add(611);  ///Es una parte del arbol  [608, 610, 611] pero agrega al principal [606, 608, 610, 611, 612, 629]
		System.out.println(s);
		System.out.println(subSet);
	}

}
