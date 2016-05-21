package inner;

import java.awt.Point;

public class Triangle {

	public Triangle() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String... at) {
		Line.Point point1 = new Line(). new Point();
		point1.method();
		System.out.println(point1);
		Line.Point point2 = new Line(). new Point();
		point2.method();
		System.out.println(point2);
		Line.Point point3 = new Line(). new Point();
		point3.method();
		System.out.println(point3);
	}

}

class Line {
	private int x = 4;
	private int y = 22;

	class Point { // Se puede ocupar cualquier modificador
		public int y = 20;

		public void method() {
			int g;
			g = Line.this.x;
			Line.this.x = 100;
			System.out.println("valor de x: " + Line.this.x);
		}
		
		public String toString(){
			return "[" + x + "," + Line.this.y + "," + y + "]";  //Si no existe otra variable con el mismo nombre, se puede hacer referencia sin el nombre de la clase externa y el this
		}
	}
}
