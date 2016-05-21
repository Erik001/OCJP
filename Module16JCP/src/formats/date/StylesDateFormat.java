package formats.date;

import java.text.DateFormat;
import java.util.Date;

public class StylesDateFormat {
	public static void main(String[] args) {
		String[] estilos = {"FULL","LONG","MEDIUM","SHORT"};
		int i = 0;
		for (String aux : estilos){
			DateFormat d2 = DateFormat.getDateInstance(i);
			String s = d2.format(new Date());
			System.out.println("fecha con formato: " + estilos[i++] + " es " + s);
		}
	}
}
