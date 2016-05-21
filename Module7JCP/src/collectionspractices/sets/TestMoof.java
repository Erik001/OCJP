package collectionspractices.sets;

import java.util.HashSet;
import java.util.Set;

public class TestMoof {

	public static void main(String[] args) {
		Set set = new HashSet();
		set.add(new Moof(2));
		set.add(new Moof(2));
		set.add(new Moof(4));
		set.add(new Moof(3));
		set.add(new Moof(4));
		set.add(new Moof(5));
		System.out.println(set);
	}

}
