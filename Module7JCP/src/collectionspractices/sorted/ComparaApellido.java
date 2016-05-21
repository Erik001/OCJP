package collectionspractices.sorted;

import java.util.Comparator;

public class ComparaApellido implements Comparator<Estudiante> {

	@Override
	public int compare(Estudiante o1, Estudiante o2) {
		return o1.getApellido().compareTo(o2.getApellido());
	}

}
