package collectionspractices.dequeue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Dequeue2Test {

	public static void main(String[] args) {
		Deque<String> deq = new ArrayDeque<>();
		deq.addFirst("one");
		deq.addFirst("two");
		deq.addFirst("three");
		
		System.out.println(deq);
		
		deq.addLast("four");
		deq.addLast("five");
		deq.addLast("six");
		
		System.out.println(deq);
		
		System.out.println(deq.pollFirst());
		System.out.println(deq.pollLast());
	}

}
