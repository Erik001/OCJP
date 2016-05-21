package collectionspractices.dequeue;

import java.util.ArrayDeque;
import java.util.Deque;

public class PushQueueTest {

	public static void main(String[] args) {
		Deque<Integer> myQue = new ArrayDeque<>();
		myQue.push(50);
		System.out.println(myQue);
		myQue.push(40);
		System.out.println(myQue);
		myQue.push(30);
		System.out.println(myQue);
		myQue.push(20); //Push always put in the position zero the value
		System.out.println(myQue);
		System.out.println("******************************************************");
		System.out.println(myQue.peek());
		System.out.println(myQue.peek());
		System.out.println(myQue.peek());
		System.out.println(myQue.peek());
		System.out.println(myQue.peek());
		System.out.println("******************************************************");
		System.out.println(myQue.pop());
		System.out.println(myQue);
		System.out.println(myQue.pop());
		System.out.println(myQue);
		System.out.println(myQue.pop());
		System.out.println(myQue);
		System.out.println(myQue.pop());
		System.out.println(myQue);
		System.out.println(myQue.pop());//BAD it fails if there is no element Exception in thread "main" java.util.NoSuchElementException
		System.out.println(myQue);

	}

}
