package condition;

import java.util.*;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SyncStack {

    private final List<Character> buffer = new ArrayList<>(400);
    private final Lock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();

    public char pop() {
        lock.lock();
        try {
            char c;
            while (buffer.isEmpty()) {
                try {
                    condition.await();
                } catch (InterruptedException ex) {
                    System.out.println(ex.getMessage());
                }
            }
            c = buffer.remove(buffer.size() - 1);
            return c;
        } finally {
            lock.unlock();
        }
    }

    public void push(char c) {
        lock.lock();
        try {
            buffer.add(c);
            condition.signal();
        } finally {
            lock.unlock();
        }
    }
}
