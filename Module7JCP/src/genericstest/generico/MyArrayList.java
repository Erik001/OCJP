package genericstest.generico;

import java.util.Iterator;

public class MyArrayList implements Iterable{

	private Object[] elementData;

	public static final int DEFAULT_CAPACITY = 4;
	private int size;
	private int tamMax;
	private int factorCarga;
	int banIterator;

	public MyArrayList() {
		elementData = new Object[DEFAULT_CAPACITY];
		this.tamMax = DEFAULT_CAPACITY;
		this.factorCarga = 3;
	}

	public boolean add(Object o) {
		if (this.size < this.tamMax) {
			elementData[size] = o;
			size++;
			return true;
		} else {
			Object[] aux = new Object[this.tamMax + factorCarga];
			System.arraycopy(elementData, 0, aux, 0, elementData.length);
			aux[size] = o;
			size++;
			this.tamMax = this.tamMax + this.factorCarga;
			elementData = aux;
			return true;
		}
	}

	public int size() {
		return size;
	}
	
	@Override
	public String toString(){
		String var = "[ ";
		for(int s = 0; s < this.size;s++){
			var += elementData[s]+" ,";
		}
		
		return (var.substring(0,var.length()-2))+ " ]";
	}

	@Override
	public Iterator iterator() {
		return new Iterator(){

			@Override
			public boolean hasNext() {
				boolean b = banIterator < size ? true : false;
				if(!b) banIterator = 0;
				return b;
			}

			@Override
			public Object next() {
				return elementData[banIterator++];
			}
			
		};
	}
	

}
