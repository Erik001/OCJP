package collectionspractices.sorted;

import java.util.ArrayList;
import java.util.Collections;

public class Name implements Comparable<Name>{
	
	String first, last;
	
	public Name(String fisrt, String last){
		this.first = fisrt;
		this.last =  last;
	}
	
	public static void main(String[] args) {
		ArrayList<Name> list = new ArrayList<>();
		list.add(new Name("Joe","Shmoe"));
		list.add(new Name("John","Doe"));
		list.add(new Name("Jane","Doe"));
		Collections.sort(list);
		for(Name n: list){
			System.out.println(n);
		}

	}

	@Override
	public int compareTo(Name arg0) {
		int compLast = last.compareTo(arg0.last);
		return compLast != 0 ? compLast: first.compareTo(arg0.first);
		
	}
	
	public String toString(){
		return first + " " + last;
	}

}
