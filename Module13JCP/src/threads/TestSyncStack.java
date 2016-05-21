package threads;

public class TestSyncStack {

	public static void main(String[] args) {
		//SyncStack stack = new SyncStack();
		SyncStack2 stack = new SyncStack2();
		//Producer producer = new Producer(stack);
		//Consumer consumer1 = new Consumer(stack);
		Producer2 producer = new Producer2(stack);
		Consumer2 consumer1 = new Consumer2(stack);
	    Consumer2 consumer2 = new Consumer2(stack);
		Thread thread1 = new Thread(consumer1);	
		Thread thread2 = new Thread(producer);//Para evitar un deadlock o se agreagn más productos a producir por el productor o se agrega otro productor
		Thread thread3 = new Thread(consumer2);
		thread1.start();
		thread3.start();
		thread2.start();
		
	}

}
