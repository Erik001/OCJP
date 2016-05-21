package collectionspractices.sets;

import java.util.Date;
import java.util.TreeSet;

public class TestTreeSet3 {

	public static void main(String[] args) {
		TreeSet<Date> set = new TreeSet<>();
		set.add(new Date());
		set.add(new Date(2016 - 1900,11,1));
		set.add(new Date(2016 - 1900,3,1));
		set.add(new Date(2016 - 1900,5,1));
		
		for(Date aux:set){
			System.out.println(aux);
		}

	}

}
