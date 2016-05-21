package comparing;

public class Contrast implements Comparable {

	private double contrastLevel;

	public Contrast() {
		contrastLevel = 0.0;
	}

	public Contrast(double contr) {
		contrastLevel = contr;
	}

	@Override
	public int compareTo(Object o) {
		if ((o == null) || !(o instanceof Contrast)) throw (new ClassCastException());
		if (((Contrast) o).getContrast() == this.contrastLevel)
			return 0;
		return (((Contrast)o).getContrast() > this.contrastLevel) ? 1 : -1;
	}

	public Double getContrast() {
		return contrastLevel;
	}

}

class AdjustContrast{
	public static void main(String[] args) {
		Contrast c1 = new Contrast(20);
		Contrast c2 = new Contrast(20);
		
		System.out.println(c2.compareTo(c1));
	}
}