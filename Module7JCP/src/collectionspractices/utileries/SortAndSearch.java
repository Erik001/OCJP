package collectionspractices.utileries;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortAndSearch {
	static final Comparator<Integer> integerComparator = new Comparator<Integer>(){

		@Override
		public int compare(Integer o1, Integer o2) {
			
			return o2.compareTo(o1);
		}
		
	};
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(1);
		list.add(3);
		list.add(2);
		list.add(5);
		list.add(6);
		list.add(4);
		Collections.sort(list,null);
		System.out.println(list);
		Collections.sort(list,integerComparator);
		System.out.println(list);

	}

}
