package collectionspractices.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {
		//Collections m2 = new TreeMap<Object,Object>();
		SortedMap<Object,Object> m4 = new TreeMap<Object,Object>();
		//HashMap<Object,Object> m3 = new SortedMap<Object,Object>();
		//Map<String,String> m = new SortedMap<String, String>();
		Map<List,ArrayList> m5 = new Hashtable<List,ArrayList>();
		// Map method entrySet()
		// values() method
		Map<String,Number> map = new HashMap();//no se puede poner <String,Integer> porque es invariante
		map.put("Key 25", 25);

	}

}
