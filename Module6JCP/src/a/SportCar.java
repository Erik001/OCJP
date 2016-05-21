package a;

interface TurboVehicle{
	
}

interface Steerable{
	class A{
		public String metodo(){
			return "metodo 1";
		}
	}
}

interface Convertible {
	
}

class Cars implements TurboVehicle, Steerable{
	class A{
		public String metodo(){
			return "metodo 2";
		}
	}
}

public class SportCar {

	public static void main(String[] args) {
		Steerable.A a = new Steerable.A();
		System.out.println(a.metodo());

	}

}
