package wrappers;

import java.util.HashMap;
import java.util.Map;

public class WrapperTest {

	public static void main(String[] args) {
		char c[] = {'a','b','c','d'};
		//String line = c;
		String l = String.valueOf(c);
		String l2 = c.toString();
		System.out.println(l + " --- " + l2);
		
		Map myMap = new HashMap<>();
		myMap.put(null, 1);
		myMap.put(null, 100);
		System.out.println(myMap);

	}

}
