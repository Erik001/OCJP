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
		//m = n; bad solo se puede cambiar el estado más no la referencia
		m.año = 10;
	}

}

// no se puede extender una clase final
/*class Sub extends TestFinal{
	
}*/

class MyDate{
	int día;
	int mes;
	int año;
	public MyDate(int día, int mes, int año) {
		super();
		this.día = día;
		this.mes = mes;
		this.año = año;
	}
	@Override
	public String toString() {
		return "MyDate [día=" + día + ", mes=" + mes + ", año=" + año + "]";
	}
	
	
}