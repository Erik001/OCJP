package threads;

public class Globo extends Thread {
	
	public Globo(){
		
	}
	
	public Globo(Runnable r, String name){
		super(r, name);
	}
	
	public void run(){
		imprime();
	}

	public void imprime() {
		System.out.println("\033[31m Hilo : " + 
		Thread.currentThread().getName());
			
	}

}
