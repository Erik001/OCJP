package nested;

public class Anidada {
	int varInstance;
	
	public Anidada() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("Hola mundo clase Externa");
		A.main(args);
		
		Anidada.A nested = new Anidada.A();
	}
	
	static class A{ //Si es estatica es anidada, le pertenece a la clase y no a la instancia
		public void method(){
			System.out.println();
		}
		
		public static void main(String[] args) {
			System.out.println("Hola mundo clase Anidada");

		}
		
	}

}
