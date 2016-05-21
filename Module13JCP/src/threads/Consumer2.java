package threads;

public class Consumer2 implements Runnable {

	private SyncStack2 theStack;
	private int num;
	private static int counter;

	public Consumer2(SyncStack2 theStack) {
		this.theStack = theStack;
		num = ++counter;
	}

	@Override
	public void run() {
		char c;
		for (int i = 0; i < 5; i++) {
			c = theStack.pop();
			System.out.println("Consumidor " + num + ": " + c);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
