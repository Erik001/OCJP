package condition;

public class Consumer implements Runnable {
	private final SyncStack theStack;
	private final int num;
	private static int counter = 1;
	
	public Consumer (SyncStack s) {
		theStack = s;
		num = counter++;
	}
        @Override
	public void run() {
		char c;
		for (int i = 0; i < 5; i++) {
			c = theStack.pop();
			System.out.println("Consumidor" + num + ": " + c);
			try {
				Thread.sleep((int)(Math.random() * 300));
			} catch (InterruptedException e) {
				// ignore it
			}
		}
	} // END run method
} // END Consumer class
