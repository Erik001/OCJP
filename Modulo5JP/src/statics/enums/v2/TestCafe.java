package statics.enums.v2;

public class TestCafe {

	public TestCafe() {
		// TODO Auto-generated constructor stub
	}

	public static void pedirCafe(Cafe coffie) {
		switch (coffie) {
		case CHICO:
			System.out.println("Sirviendo Cafe: " + coffie.name());
			System.out.println(coffie);
			break;
		case MEDIANO:
			System.out.println("Sirviendo Cafe: " + coffie.name());
			System.out.println(coffie);
			break;
		case GRANDE:
			System.out.println("Sirviendo Cafe: " + coffie.name());
			System.out.println(coffie);
			break;
		}

	}

	public static void main(String[] args) {
		pedirCafe(Cafe.CHICO);
		pedirCafe(Cafe.MEDIANO);
		pedirCafe(Cafe.GRANDE);
		System.out.println("*************");
		for (Cafe aux : Cafe.values()) {
			System.out.println(aux);
			System.out.println("*************");
		}

	}

}

// el enum sigue el patron de diseño singleton

enum Cafe {
	CHICO(300, 12.50), MEDIANO(450, 16.50), GRANDE(600, 20.50);

	private Cafe(double mililitros, double precio) { // inclusive quitando el
														// modificador es
														// privado
		this.mililitros = mililitros;
		this.precio = precio;
	}

	private double mililitros;
	private double precio;

	public double getMililitros() {
		return mililitros;
	}

	public void setMililitros(double mililitros) {
		this.mililitros = mililitros;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return this.name() + " precio: " + this.getPrecio() + " mililitros: " + this.getMililitros();
	}
}
