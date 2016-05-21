package dessignpatterns.singleton;

public class TestShow implements Runnable {

	Show show;

	public TestShow() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		TestShow test = new TestShow();
		new Thread(test,"Juan").start();
		new Thread(test,"Erik").start();
		new Thread(test,"Maritza").start();
		new Thread(test,"Luis").start();
		new Thread(test,"Nora").start();
		new Thread(test,"Paco").start();
		new Thread(test,"Luis").start();
		new Thread(test,"Mario").start();
		new Thread(test,"Memo").start();
	}

	@Override
	public void run() {
		show = Show.getInstance();
		int i = 1;
		for (; i <= 3; i++)
			if (show.ticketAgentBook("A" + i)) {
				break;
			}
		if (i > 3)
			System.out.println(
					"Estimado: " + Thread.currentThread().getName() + " no contamos con asientos disponibles.");
	}

}
