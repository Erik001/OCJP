package collectionspractices.sorted;

import java.util.Comparator;

public class ComparaNombre implements Comparator<Estudiante> {

	@Override
	public int compare(Estudiante o1, Estudiante o2) {
		return o1.getName().compareTo(o2.getName());
	}


}
