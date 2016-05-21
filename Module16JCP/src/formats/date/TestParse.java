package formats.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public class TestParse {

	public static void main(String[] args) {
		Locale loc = new Locale("fr","FR");
		DateFormat df = DateFormat.getDateInstance(2,loc);
		try {
			Date date = df.parse("31 juillet 2013");
			System.out.println(date);
			System.out.println(df.format(date));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
