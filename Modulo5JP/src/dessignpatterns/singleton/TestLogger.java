package dessignpatterns.singleton;

public class TestLogger implements Runnable {

	public TestLogger() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		/*Logger logger = Logger.getInstance();
		Logger logger2 = Logger.getInstance();
		Logger logger3 = Logger.getInstance();
		Logger logger4 = Logger.getInstance();
		
		System.out.println(logger == logger2);
		System.out.println(logger2 == logger3);
		System.out.println(logger3 == logger4);*/
		new Thread(new TestLogger(), "Ricardo").start();
		new Thread(new TestLogger(), "Diana").start();
		new Thread(new TestLogger(), "Erik").start();
		new Thread(new TestLogger(), "Eduardo").start();
		new Thread(new TestLogger(), "Diana2").start();
		new Thread(new TestLogger(), "Erik2").start();
		new Thread(new TestLogger(), "Eduardo2").start();
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " " + Logger.getInstance());		
	}

}
