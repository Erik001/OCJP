package dessignpatterns.singleton;

public class Show {

	private static final Show INSTANCE;
	private String[][] availableSeat = { { "A1", "available" }, { "A2", "available" }, { "A3", "available" } };

	static{
		INSTANCE= new Show();
	}

	private Show() {
		// TODO Auto-generated constructor stub
	}
	
	public synchronized boolean ticketAgentBook(String seat){
		int indice = Integer.parseInt(seat.substring(1))-1;
		if(INSTANCE.availableSeat[indice][1].equals("available")){
			INSTANCE.availableSeat[indice][1] = "no available";
			System.out.println("Estimado : " + Thread.currentThread().getName() + " su asiento es: " + INSTANCE.availableSeat[indice][0]);
			return true;
		}
		return false;
	}
	
	public static Show getInstance(){
		return INSTANCE;
	}

}
