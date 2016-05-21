package formats.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TestSimpleDateFormat {

	public static void main(String[] args) {
		Date d = new Date();
		String pattern  = "EEEE, MMMM d, yyyy";
		Locale loc = Locale.US;
		SimpleDateFormat sdf = new SimpleDateFormat(pattern,loc);
		System.out.println(String.format("locale: %s; custom date format: %s", loc, sdf.format(d)));

	}

}
