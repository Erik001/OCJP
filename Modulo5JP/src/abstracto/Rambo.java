package abstracto;

public class Rambo {

	public Rambo() {

	}

	public void mataMarciano() {
		if (statics.Marciano.cuentaMarciano > 0) {
			statics.Marciano.cuentaMarciano--;
			System.out.print("Santo : mato un marciano, ");
		}

		System.out.println(" quedan : " + statics.Marciano.cuentaMarciano);
	}

	public void lanzaGranada() {
		if (statics.Marciano.cuentaMarciano > 0) {
			statics.Marciano.cuentaMarciano = ((statics.Marciano.cuentaMarciano -= 5) > 0)
					? statics.Marciano.cuentaMarciano : 0;
			// System.out.print("Rambo : mato un marciano, ");
		}
	}

}
