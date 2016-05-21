package collectionspractices.sorted;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortAndSearch2 {

	static final Comparator<Integer> integerComparator = new Comparator<Integer>() {
		
		@Override
		public int compare(Integer o1, Integer o2) {
			
			return o2.compareTo(o1);
		}
	};
	public static void main(String[] args) {
		ArrayList<Integer> lis = new ArrayList<>();
		lis.add(4);
		lis.add(1);
		lis.add(3);
		lis.add(2);
		Collections.sort(lis,null);
		System.out.println(Collections.binarySearch(lis, 3));
		Collections.sort(lis,integerComparator);
		System.out.println(Collections.binarySearch(lis, 3));

	}

}
