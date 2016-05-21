package statics;

//final se asigna el valor en los bloques estaticos o en el constructor

public final class TestFinal {
	final int  VAR;
	{
		//VAR = 1;
	}
	public TestFinal(final int x, final int y) {
		//x++; BAD no se permite son finals x y y
		VAR = 1;
	}
	
	//no se puede hacer override
	public final int metodoFinal(){
		return 0;
	}
	
	public static void main(String...tup){
		MyDate d = new MyDate(20, 2, 2016);
		testFinalReference(d);
		
	}
	
	public static void testFinalReference(final MyDate m){
		MyDate n = new MyDate(22, 2, 2016);
		//m = n; bad solo se puede cambiar el estado m�s no la referencia
		m.a�o = 10;
	}

}

// no se puede extender una clase final
/*class Sub extends TestFinal{
	
}*/

class MyDate{
	int d�a;
	int mes;
	int a�o;
	public MyDate(int d�a, int mes, int a�o) {
		super();
		this.d�a = d�a;
		this.mes = mes;
		this.a�o = a�o;
	}
	@Override
	public String toString() {
		return "MyDate [d�a=" + d�a + ", mes=" + mes + ", a�o=" + a�o + "]";
	}
	
	
}