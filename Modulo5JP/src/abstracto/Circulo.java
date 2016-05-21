package abstracto;
import static java.lang.Math.PI;

public class Circulo extends Figura {
	private double radio;
	private double area;
	
	public Circulo(int i) {
		super(i);
		// TODO Auto-generated constructor stub
	}

	@Override
	int getArea() {
		area = Math.PI * radio * radio;
		return 0;
	}

}
