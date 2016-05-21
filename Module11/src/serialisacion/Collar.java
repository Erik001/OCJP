package serialisacion;

import java.io.Serializable;

//public class Collar implements Serializable {
public class Collar  {
	private int collarSize;

	public Collar(int collarSize) {
		this.collarSize = collarSize;
	}

	public int getCollarSize() {
		return collarSize;
	}

	public void setCollarSize(int collarSize) {
		this.collarSize = collarSize;
	}

	@Override
	public String toString() {
		return "Collar [collarSize=" + collarSize + "]";
	}
	
	
}
