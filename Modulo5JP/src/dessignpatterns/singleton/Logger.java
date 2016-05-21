package dessignpatterns.singleton;

public class Logger {

	//public static Logger myInstance = new Logger(); 1. Iniicializando la variable y no hacer la validación A
	public static Logger myInstance;
	
	private Logger() {

	}
	//2. Se sincroniza el metodo para evitar que se haga un múltiple acceso por varios usuarios
	public static synchronized Logger getInstance() {
		/*Validación A*/
		 if (myInstance == null)
			myInstance = new Logger();
		return myInstance;
	}

}
