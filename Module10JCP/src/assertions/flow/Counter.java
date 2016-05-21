package assertions.flow;

public class Counter {

	public static int getCount(String[] args) {
		int count = 0;
		for (String str : args) {
			count++;
		}

		return count;
	}

	public static void main(String[] args) {
		String arr[] = new String[] { null, "C", "", "Java" };
		assert (getCount(arr) < arr.length);
		System.out.println(getCount(arr));
	}

}
