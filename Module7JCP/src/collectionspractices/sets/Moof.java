package collectionspractices.sets;

public class Moof implements Comparable<Moof> {
	private int value;

	public Moof(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "" + value;
	}

	@Override
	public boolean equals(Object o) {
		if (o.getClass() == this.getClass()) {
			Moof m = (Moof) o;
			return (this.value == m.value) ? true : false;
		} else
			return false;
	}

	@Override
	public int hashCode() {
		return this.value;
	}

	@Override
	public int compareTo(Moof m) {
		return (m.value == this.value) ? 0 : (m.value > this.value) ? -1 : 1;
	}

	// @Override
	/*
	 * public int compareTo(Object o) { if (o.getClass() == this.getClass()) {
	 * Moof m = (Moof) o; return (m.value == this.value) ? 0 : (m.value >
	 * this.value) ? -1 : 1; }else{ return 9; }
	 * 
	 * }
	 */

}
