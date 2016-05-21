package condition;

public class Producer implements Runnable {
	
	private final SyncStack theStack;
	private final int num;
	private static int counter = 1;
	
	public Producer (SyncStack s) {
		theStack = s;
		num = counter++;
	}
	
        @Override
	public void run() {
		char c;
		
		for (int i = 0; i < 5; i++) {
			c = (char)(Math.random() * 26 +'A');
			theStack.push(c);
			System.out.println("Productor" + num + ": " + c);
			try {
				Thread.sleep((int)(Math.random() * 300));
			} catch (InterruptedException e) {
			// ignore it
			}
		}
	} // END run method	
} // END Producer class