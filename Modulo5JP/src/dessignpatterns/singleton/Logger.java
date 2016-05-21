package dessignpatterns.singleton;

public class Logger {

	//public static Logger myInstance = new Logger(); 1. Iniicializando la variable y no hacer la validaci�n A
	public static Logger myInstance;
	
	private Logger() {

	}
	//2. Se sincroniza el metodo para evitar que se haga un m�ltiple acceso por varios usuarios
	public static synchronized Logger getInstance() {
		/*Validaci�n A*/
		 if (myInstance == null)
			myInstance = new Logger();
		return myInstance;
	}

}
