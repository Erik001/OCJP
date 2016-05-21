package statics;

public class Marciano {

	public static int cuentaMarciano = 5;
	
	public Marciano() {
		Marciano.cuentaMarciano++;
	}

	public static int getCuentaMarciano() {
		return cuentaMarciano;
	}

	public static void setCuentaMarciano(int cuentaMarciano) {
		Marciano.cuentaMarciano = cuentaMarciano;
	}

}
