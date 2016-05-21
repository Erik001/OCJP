package collectionspractices.dequeue;

import java.util.ArrayDeque;
import java.util.Deque;

public class AddDequeue {

	public static void main(String[] args) {
		Deque<String> deq = new ArrayDeque<>();
		deq.add("one");
		deq.add("two");
		deq.add("three");
		
		System.out.println(deq);
		System.out.println(deq.peek());
		System.out.println(deq);
		/*System.out.println(deq.poll());
		System.out.println(deq.poll());
		System.out.println(deq.poll());
		System.out.println(deq.poll());
		System.out.println(deq.poll());*/
		//poll() can be execute as many times as you want and it wont fail
		/*System.out.println(deq.remove());
		System.out.println(deq.remove());
		System.out.println(deq.remove());
		System.out.println(deq.remove());*///It will fail, Exception in thread "main" java.util.NoSuchElementException
		System.out.println(deq);
		
		
	}

}
