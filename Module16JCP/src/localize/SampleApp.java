package localize;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.ResourceBundle;

public class SampleApp {
	PrintWriter pw = new PrintWriter(System.out, true);
	Locale usLocale = Locale.US;
	Locale frLocale = Locale.FRANCE;
	// Locale chLocale = Locale.CHINA;
	Locale zhLocale = new Locale("zh", "CN");
	Locale ruLocale = new Locale("ru","RU");
	Locale esLocale = new Locale("es","MX");
	Locale currentLocale = Locale.getDefault();
	BufferedReader br = null;
	ResourceBundle messages = ResourceBundle.getBundle("bundle.MessageBundle");

	public SampleApp() {
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	public void run() {
		String line = "";
		while (!(line.equals("q"))) {
			this.printMenu();
			try {
				line = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			switch (line) {
			case "1":
				setEnglish();
				break;
			case "2":
				setFrench();
				break;
			case "3":
				setChinese();
				break;
			case "4":
				setRussian();
				break;
			case "5":
				setSpanish();
				break;
			}
		}
	}

	private void setSpanish() {
		currentLocale = esLocale;
		messages = ResourceBundle.getBundle("bundle.MessageBundle",currentLocale);
		
	}

	private void setRussian() {
		currentLocale = ruLocale;
		messages = ResourceBundle.getBundle("bundle.MessageBundle",currentLocale);
		
	}

	private void setChinese() {
		currentLocale = zhLocale;
		messages = ResourceBundle.getBundle("bundle.MessageBundle",currentLocale);
		
	}

	private void setFrench() {
		currentLocale = frLocale;
		messages = ResourceBundle.getBundle("bundle.MessageBundle",currentLocale);
		
	}

	private void setEnglish() {
		currentLocale = usLocale;
		messages = ResourceBundle.getBundle("bundle.MessageBundle",currentLocale);
		
	}
	
	public void printMenu(){
		pw.println("===Localization App===");
		pw.println("1. " + messages.getString("menu1"));
		pw.println("2. " + messages.getString("menu2"));
		pw.println("3. " + messages.getString("menu3"));
		pw.println("4. " + messages.getString("menu4"));
		pw.println("5. " + messages.getString("menu5"));
		pw.println("q. " + messages.getString("menuq"));
	}
	
	public static void main(String[] args) {
		SampleApp ui = new SampleApp();
		ui.run();
	}
}
