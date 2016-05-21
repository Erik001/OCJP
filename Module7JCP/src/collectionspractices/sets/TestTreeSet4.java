package collectionspractices.sets;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TestTreeSet4 {

	public static void main(String[] args) {
		NavigableSet set = new TreeSet();
		set.add(new Moof(56));
		set.add(new Moof(5));
		set.add(new Moof(50));
		set.add(new Moof(30));
		set.add(new Moof(100));
		set.add(new Moof(100));
		set.add(new Moof(100));
		
		for(Object aux: set){
			System.out.println(aux);
		}
	}

}
