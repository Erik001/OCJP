package assertions.flow;

public class Counter2 {

	public static void main(String[] args) {
		String[] arr = new String[4];
		arr[1] = "C";
		arr[2] = "";
		arr[3] = "JAVA";
		assert(getCount(arr)< arr.length);
		System.out.println(getCount(arr));

	}

	private static int getCount(String[] arr) {
		int count = 0;
		for(String var: arr){
			//if(var != null) 
				count++;
		}
		System.out.println(count);
		return count;
	}

}
