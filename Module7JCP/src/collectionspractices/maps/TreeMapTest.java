package collectionspractices.maps;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		Map<String, String> map = new TreeMap<>();//You can have a map as value Map<String, Map<String, String>>
		Map map2 = new TreeMap();
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		//map.put(null, "null value");//BAD cannot add null because it compares objects and because of this it has to invoke a method
		map2.put("key1", "value1");
		map2.put("key2", "value2");
		map2.put("key3", "value3");
		map2.put(4, "value3");//BAD java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer
		System.out.println(map);
		System.out.println(map2);

	}

}
