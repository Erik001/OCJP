package threads;

import java.util.ArrayList;
import java.util.List;

public class SyncStack {
	private List<Character> buffer = new ArrayList<>();

	public synchronized char pop() {
		if (buffer.size() != 0)
			return buffer.remove(buffer.size() - 1);
		else
			return '\000';
	}

	public synchronized void push(char c) {
		buffer.add(c);
	}
}
