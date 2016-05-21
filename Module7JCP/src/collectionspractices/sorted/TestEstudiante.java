package collectionspractices.sorted;

import java.util.TreeSet;

public class TestEstudiante {

	public static void main(String[] args) {
		TreeSet set = new TreeSet<>();//intuye que es <Object>
		set.add(new Estudiante("Erik", "Torres", 21));
		set.add(new Estudiante("Luis", "Prado", 5));
		set.add(new Estudiante("Mario", "Ruiz", 5));
		set.add(new Estudiante("Francisco", "Andrade", 14));
		set.add(new Estudiante("Maritza", "Arce", 17));
		set.add(new Estudiante("Juan", "Herrera", 17));
		
		for(Object estudiante: set){
			System.out.println(estudiante);
		}
	}

}
