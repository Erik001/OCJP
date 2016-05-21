package formats.numbers;

import java.text.NumberFormat;
import java.util.Locale;

public class TestNumber {

	public static void main(String[] args) {
		float f = 12.34556f;
		float g = 12;
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits(2);
		nf.setMinimumFractionDigits(3);
		System.out.println(nf.format(f));
		System.out.println(nf.format(g));
		
		Locale loc = new Locale("it", "IT");
		NumberFormat nf2 = NumberFormat.getCurrencyInstance(loc);
		System.out.println(nf2.format(f));
		NumberFormat nf3 = NumberFormat.getCurrencyInstance(new Locale("es", "MX"));
		System.out.println(nf3.format(g));
	}

}
