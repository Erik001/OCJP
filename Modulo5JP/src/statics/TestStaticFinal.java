package statics;

public class TestStaticFinal {

	static final public int CONSTANT;

	// solo declaración y en bloque estatico
	static {
		CONSTANT = 2;
	}

	public TestStaticFinal() {
		// CONSTANT= 2; No es posible, pues se requiere que la instacia este
		// generada
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
