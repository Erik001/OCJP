package collectionspractices.maps;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapClass {

	public static void main(String[] args) {
		Map<String,String> parList = new TreeMap<>();
		parList.put("P002", "Large Widget");
		parList.put("P001", "Widget");
		parList.put("P002", "X-Large Widget");
		Set<String> keys = parList.keySet();
		for(String key: keys){
			System.out.println(key + " " + parList.get(key));
		}

	}

}
