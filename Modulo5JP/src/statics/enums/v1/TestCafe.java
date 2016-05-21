package statics.enums.v1;

class Cafe {
	public static final int CHICO = 1;
	public static final int MEDIANO = 2;
	public static final int GRANDE = 3;

	public static int getChico() {
		return CHICO;
	}

	public static int getMediano() {
		return MEDIANO;
	}

	public static int getGrande() {
		return GRANDE;
	}

}

public class TestCafe {

	public TestCafe() {
		// TODO Auto-generated constructor stub
	}

	public static void pedirCafe(int tamano) {
		switch (tamano) {
		case Cafe.CHICO:
			System.out.println("Sirviendo Cafe: " + "Chico");
			break;
		case Cafe.MEDIANO:
			System.out.println("Sirviendo Cafe: " + "Mediano");
			break;
		case Cafe.GRANDE:
			System.out.println("Sirviendo Cafe: " + "Grande");
			break;
		default:
			System.out.println("Opción incorrecta!!!");
		}

	}

	public static void main(String[] args) {
		pedirCafe(Cafe.GRANDE);
		pedirCafe(Cafe.MEDIANO);
		pedirCafe(Cafe.CHICO);
		pedirCafe(3);
		pedirCafe('6');

	}

}
