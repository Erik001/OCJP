package threads;

class TestThread {
	public static void main(String[] args) {
		HelloRunner r = new HelloRunner();
		Thread t1 = new Thread(r, "Erik");
		Thread t2 = new Thread(r);
		t2.setName("Taquito");
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		
		t2.start();
		/*
		 * try { t1.join(); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		//for (int i = 0; i < 7; i++)
			//System.out.println(Thread.currentThread().getName() + " , i: " + HelloRunner.i++);

	}
}

public class HelloRunner implements Runnable {
	// int i = 1; //Si la variable es local se vuelve thread safe
	//static  int i = 1;
	private static  int i = 1; // lo volvemos privado

	@Override
	public synchronized void run() {
		// public void run() { //quitamos synchronized para probar el join
		for (; i <= 50; i++) {
			System.out.println("Run by----> " + Thread.currentThread().getName() + " " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
