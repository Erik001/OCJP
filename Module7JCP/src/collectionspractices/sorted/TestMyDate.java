package collectionspractices.sorted;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TestMyDate {

	public static void main(String[] args) {
		NavigableSet<MyDate> set = new TreeSet<>();
		set.add(new MyDate(5,6,2015));
		set.add(new MyDate(15,9,2016));
		set.add(new MyDate(15,2,2016));
		set.add(new MyDate(25,1,2015));
		set.add(new MyDate(13,8,2015));
		
		for(MyDate md: set){
			System.out.println(md);
		}

	}

}
