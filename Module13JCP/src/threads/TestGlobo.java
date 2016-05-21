package threads;

public class TestGlobo {

	public static void main(String[] args) {
		Thread globo = new Globo();
		globo.setName("Globo Rojo");
		globo.run();
		globo.run();
		globo.start();
		// globo.start(); You cannot start the same thread more than one time

		new Globo() {
			@Override
			public void run() {
				setName("Globo Verde");
				imprime();
			}

			@Override
			public void imprime() {
				System.out.println("\033[32m Hilo: " + Thread.currentThread().getName());
			}
		}.start();
		new Thread(new Runnable(){

			@Override
			public void run() {
				//setName(); doesn't exists
				imprime();
				
			}

			public void imprime() {
				System.out.println("\033[34m Hilo: " + Thread.currentThread().getName());
				
			}
			
		},"Globo Azul").start();
	}

}
