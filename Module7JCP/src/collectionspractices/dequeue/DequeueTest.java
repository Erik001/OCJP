package collectionspractices.dequeue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueTest {

	public static void main(String[] args) {
		Deque<Integer> deq = new ArrayDeque<>();
		deq.add(45);
		deq.add(30);
		deq.add(1);
		deq.add(7);
		deq.add(9);
		deq.push(1);
		
		System.out.println(deq);
		System.out.println(deq.poll());
		System.out.println(deq);
		System.out.println(deq.pop());
		System.out.println(deq);
		System.out.println(deq.remove());
		System.out.println(deq);

	}

}
