package anonima;

public abstract class Anima {

	public Anima() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

	}

	public abstract void saludo(String nombre);

}
interface A{
	public String toString();
}
class HolaMundo {
	Anima a = new Anima() {

		@Override
		public void saludo(String nombre) {
			metodoAnonimo();
			System.out.println("Hola clase anonima " + nombre);

		}

		public void metodoAnonimo() {
			System.out.println("!!!!!!!!");
		}

	};

	HolaMundo() {

	}

	public static void main(String[] art) {
		HolaMundo holaMundo = new HolaMundo();
		holaMundo.a.saludo("Erik");
		
		System.out.println(new A(){///Anonima con un interface,no hace falta implementar el toString pues extiende de object
			public String toString(){
				return "clase anonima que se genero con un interface";
			}
		});
	}
}
