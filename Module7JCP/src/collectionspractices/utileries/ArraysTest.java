package collectionspractices.utileries;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysTest {

	public static void main(String[] args) {
		String arr[] = { "uno", "dos", "tres", "cuatro", "cinco" };
		List list = Arrays.asList(arr);// Is limited by the array, due that the
										// size of the array cannot be increased
		// list.add("six");//BAD java.lang.UnsupportedOperationException it
		// depends of the array, size cannot change
		// list.remove(1);//BAD java.lang.UnsupportedOperationException it
		// depends of the array, size cannot change
		// list.sort(null); possible it is a Java 8 method
		// Collections.sort(list); //it works the same as Arrays.sort over the
		// array, because we're working with the same object, in this case the
		// array
		Arrays.sort(arr);
		System.out.println(Collections.binarySearch(list, "tres"));// For the
																	// binarySerch
																	// to work,
																	// the
																	// collection
																	// has to be
																	// arranged
																	// in
																	// ascending
																	// order
		System.out.println(Collections.binarySearch(list, "trees"));
		System.out.println(Collections.binarySearch(list, "veinte"));
		System.out.println(list);
		String arr2[] = { "uno", "dos", "tres", "cuatro", "cinco" };
		List list2 = Arrays.asList(arr2);
		System.out.println(Collections.binarySearch(list2, "cinco"));
		System.out.println(list2);

	}

}
