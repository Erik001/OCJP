package statics;

import abstracto.Rambo;
import abstracto.Santo;

public class MarcianoTest {

	static int x = 90;
	public MarcianoTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Santo s = new Santo();
		Rambo r = new Rambo();
		
		s.mataMarciano();
		r.mataMarciano();
		Marciano m1 = new Marciano();
		Marciano m2 = new Marciano();
		Marciano m3 = new Marciano();
		Marciano m4 = new Marciano();
		r.lanzaGranada();
		System.out.println("***************************************");
		System.out.println("Maricanos Restantes: " + Marciano.cuentaMarciano);

	}
	
	static class ClaseAnidada{
		
	}

}
