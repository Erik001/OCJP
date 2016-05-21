package exceptions;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class TestMultiCatch {

	public static void main(String[] args) {
		try {
			testAge();
			leerArchivo();
		}/* catch (InvalidAgeException ia) {
		} catch (FileNotFoundException fn) {
		}*/
		catch(InvalidAgeException | FileNotFoundException  | NullPointerException e){
			
		}
	}

	public static void testAge() {
		throw new InvalidAgeException("Categoría Invalida");
	}

	public static void leerArchivo() throws FileNotFoundException {
		throw new FileNotFoundException("No pude encontrar el archivo");
	}

}
