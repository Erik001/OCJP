package hilos;


public class TestSyncStack {
    public static void main(String[] args) {
        SyncStack stack = new SyncStack();
        Producer producer1 = new Producer(stack);
        Consumer consumer1 = new Consumer(stack);
        Consumer consumer2 = new Consumer(stack);
        Thread t1 = new Thread(producer1);
        Thread t2 = new Thread(consumer1);
        Thread t3 = new Thread(consumer2);
        t1.start();
        t2.start();
        t3.start();
    }
}
