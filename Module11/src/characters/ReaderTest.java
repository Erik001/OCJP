
package characters;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderTest {

	public static void main(String[] args) {
		
		displayDetails2();
	}
	
	public static void displayDetails(){
		try(BufferedReader br = new BufferedReader(new FileReader("c:\\Libraries\\daty.bin"))){
			String record;
			while((record = br.readLine()) != null){
				System.out.println(record);
			}
			br.close();
			//br = new BufferedReader(new FileReader("c:\\Libraries\\daty.bin")); BAD
			//The resource br of a try-with-resources statement cannot be assigned

			while((record = br.readLine()) != null){
				System.out.println(record);
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage() + " ---> " + e.getClass());
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void displayDetails2(){
		try(BufferedReader br = new BufferedReader(new FileReader("msg.dat"))){
			String record;
			while((record = br.readLine()) != null){
				System.out.println(record);
			}
			br.close();
		} catch (IOException e) {
			System.out.println(e.getClass());
			e.printStackTrace();
		}
	}

}
