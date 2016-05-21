package collectionspractices.utileries;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Integer> list = Collections.nCopies(5, new Integer(5));
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + 1 + ":" + list.get(i));
		}

		List<Object> objList = new ArrayList<>(2);
		for (int i = 0; i < 5; i++) {
			objList.add(i);
		}
		System.out.println("******************************************************");
		System.out.println(list);
		System.out.println(objList);

		Collections.copy(objList, list);

		System.out.println("******************************************************");
		System.out.println(list);
		System.out.println(objList);
		// if the destination list has an smaller size than the source list, it
		// will throw an exception

	}

}
