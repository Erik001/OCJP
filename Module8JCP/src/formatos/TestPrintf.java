package formatos;

import java.io.PrintWriter;

public class TestPrintf {

	public static void main(String[] args) {
		PrintWriter pw = new PrintWriter(System.out, true);
		double price = 19.123_456_789;
		int quantity = 675;
		String color = "Blue";
		String curso = "Java Aptech";
		
		//%[index$][flags][width][.precision] conversion char
		
		System.out.printf("We have %0+9d %s Polo shirts that cost "
				+ "$%3.2f %n", quantity, color,price);
		
		System.out.printf("We have %0+2d %s Polo shirts that cost "
				+ "$%3.2f %n", quantity, color,price);
		
		System.out.printf("We have %+7d %s Polo shirts that cost "
				+ "$%3.2f %n", quantity, color,price);  //width is the minimum
		System.out.printf("Texto %.4s %n", curso); //cuando se trabaja con texto serían los caracteres a mostrar .4
		
		int base = 7;
		int base2 = -777;
		for(int i = 1; i <=10; i++){
			System.out.printf("%2$-2d x %3$02d = %3d %n",base * i, base,i);
		}
		System.out.printf("%n%n************************************************* %n \n");
		for(int i = 1; i <=10; i++){
			System.out.printf("%2$-(2d x %3$-2d = %,3d %n",base2 * i, base2,i);
		}

	}

}
