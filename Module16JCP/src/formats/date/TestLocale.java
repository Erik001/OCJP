package formats.date;

import java.util.Locale;

public class TestLocale {

	public static void main(String[] args) {
		Locale loc1 = Locale.CANADA;
		Locale loc2 = new Locale("es");
		Locale loc3 = new Locale.Builder().setLanguage("fr").setRegion("CA").build();
		Locale loc4 = Locale.forLanguageTag("fr-CA");
		
		String paisDefecto = Locale.getDefault().getCountry();
		System.out.println("Pa�s por defecto: " + paisDefecto);
		String lenguajeDefecto = Locale.getDefault().getLanguage();
		System.out.println("Lenguaje por defecto: " + lenguajeDefecto);
		String[] countries = Locale.getISOCountries();
		System.out.println("*****C�digos de Paises******");
		for(String country: countries){
			System.out.println(country);
		}
		String[] languages = Locale.getISOLanguages();
		System.out.println("*****C�digos de Lenguaje******");
		for(String language: languages){
			System.out.println(language);
		}
		
		
	}

}
