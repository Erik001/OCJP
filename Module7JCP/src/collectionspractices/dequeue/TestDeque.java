package collectionspractices.dequeue;

import java.util.ArrayDeque;
import java.util.Deque;

public class TestDeque {

	public static void main(String[] args) {
		Deque<String> myQue = new ArrayDeque<>();
		myQue.push("one");
		myQue.push("two");
		myQue.push("three");
		Deque<String> myQue2 = new ArrayDeque<>();
		myQue2.add("one");
		myQue2.add("two");
		myQue2.add("three");
		System.out.println(myQue2.peek());
		System.out.println(myQue2.peek());
		System.out.println(myQue.pop());

	}

}
