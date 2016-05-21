package threads;

public class Producer2 implements Runnable {
	private SyncStack2 theStack;
	private int num;
	private static int counter = 1;

	public Producer2(SyncStack2 theStack) {
		this.theStack = theStack;
		num = counter++;
	}

	@Override
	public void run() {
		char c;
		for (int i = 0; i < 10; i++) {
			c = (char) (Math.random() * 26 + 'A');
			theStack.push(c);
			System.out.println("productor: " + num + ": " + c);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
