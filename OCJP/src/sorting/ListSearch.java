package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSearch {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		int i = 0;
		fillList(list);
		list.add(6);
		Collections.sort(list);
		i = Collections.binarySearch(list, 6);
		
		System.out.println(list.get(i));

	}

	static void fillList(List<Integer> list) {
		for (int i = 0; i < 20; i++) {
			if (i % 2 == 0) {
				list.add(i);
			} else {
				list.add(i + 20);
			}
		}
	}

}
