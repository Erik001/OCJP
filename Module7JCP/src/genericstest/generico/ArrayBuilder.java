package genericstest.generico;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayBuilder<T> {
	@SafeVarargs
	public static <T> void addToList(List<T> listArg, T... elements) {
		for (T x : elements) {
			listArg.add(x);
		}
	}

	@SuppressWarnings({ "unchecked", "varargs" })
	public static void faultyMethod(List<String>... lo) {
		System.out.println("-------------------------------------------------------");
		Object[] objectArray = lo;
		//objectArray[0] = Arrays.asList(new Integer(42));
		objectArray[0] = Arrays.<String>asList("1","2");

		for (Object aux : objectArray) {
			System.out.println(aux);
		}

		String s = lo[0].get(0);
		System.out.println("s:::::" + s);
	}

}

class HeapPolutionSample {
	public static void main(String[] args) {
		List<String> stringListA = new ArrayList<>();
		List<String> stringListB = new ArrayList<>();

		ArrayBuilder.addToList(stringListA, "seven", "eight", "nine");
		ArrayBuilder.addToList(stringListA, "ten", "eleven", "twelve");

		for (String auxA : stringListA) {
			System.out.println(auxA);
		}
		
		List<List<String>> listOfStringsList = new ArrayList<>();
		ArrayBuilder.addToList(listOfStringsList, stringListA,stringListB);
		

		
		ArrayBuilder.faultyMethod(Arrays.asList("Hello"),Arrays.asList("World!","two","three"));
		
		for (List<String> auxB : listOfStringsList) {
			System.out.println(auxB);
		}

	}
}