package threads;

public class Hilo {
	
	synchronized void hit(long n){
		for(int i = 0; i < 3; i++){
			System.out.println(n + " - " + i + " " );
		}
	}

}

class Tester implements Runnable{
	static Hilo hilo = new Hilo();
	@Override
	public void run() {
		hilo.hit(Thread.currentThread().getId());
		
	}
	
	public static void main(String[] args) {
		new Thread(new Tester()).start();
		new Thread(new Tester()).start();
	}
	
}
