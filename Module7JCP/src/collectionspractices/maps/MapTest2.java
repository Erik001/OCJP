package collectionspractices.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import collectionspractices.sets.Moof;

public class MapTest2 {

	public static void main(String[] args) {
		Map<Moof,String> map = new LinkedHashMap<>();
		Map<Moof,String> map2 = new HashMap<>();
		
		map.put(new Moof(7), "seven");
		map.put(new Moof(2), "two");
		map.put(new Moof(7), "new seven");
		map.put(new Moof(2), "new two"); //A map cannot have duplicate keys
		//At this point it will print {7=new seven, 2=new two}
		map.put(null, null);
		map.put(null, "new value");
		
		map2.put(new Moof(7), "seven");
		map2.put(new Moof(2), "two");
		
		System.out.println(map);
		System.out.println(map2);
		

	}

}
