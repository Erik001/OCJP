package threads;

import java.util.ArrayList;
import java.util.List;

public class SyncStack2 {
	private List<Character> buffer = new ArrayList<>();

	public synchronized char pop() {
		//if (buffer.size() == 0) { //to avoid the error due to concurrency
		while (buffer.size() == 0) {
			System.out.println("Me espero...!");
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return buffer.remove(buffer.size() - 1);
	}

	public synchronized void push(char c) {
		buffer.add(c);
		this.notify();
	}
}
