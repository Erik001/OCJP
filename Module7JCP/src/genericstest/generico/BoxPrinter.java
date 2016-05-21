package genericstest.generico;

public class BoxPrinter<T> {
	private T val;

	public BoxPrinter(T arg) {
		val = arg;
	}
	
	public String toString(){
		return "[" + val + "]";
	}

}

class BoxPrinterTest3 {
	public static void main(String[] args) {
		System.out.println(new BoxPrinter<Integer>(new Integer(10)));
		System.out.println(new BoxPrinter("Hello world"));

	}

}
