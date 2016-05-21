package collectionspractices.sorted;

import java.util.TreeSet;

public class TestEstudiante3 {

	public static void main(String[] args) {
		ComparaApellido ca = new ComparaApellido();
		TreeSet<Estudiante> set = new TreeSet<>(ca);// intuye que es <Object>
		set.add(new Estudiante("Erik", "Torres", 21));
		set.add(new Estudiante("Luis", "Prado", 5));
		set.add(new Estudiante("Mario", "Ruiz", 5));
		set.add(new Estudiante("Mario", "Leal", 14));
		set.add(new Estudiante("Maritza", "Arce", 17));
		set.add(new Estudiante("Juan", "Herrera", 17));


		for (Estudiante estudiante : set) {
			System.out.println(estudiante);
		}

	}

}
