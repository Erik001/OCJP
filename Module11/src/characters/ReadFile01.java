package characters;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile01 {

	public static void main(String[] args) {
		int a,b,c; a=b=c=100;
		int d,e1,f=100;
		int g=100,h,i;
		String fileName = "myfile.txt";
		try(BufferedReader buffIn = new BufferedReader(new FileReader(fileName));){
			String line = "";
			int count = 1;
			line = buffIn.readLine();
			while(line != null){
				count++;
				line = buffIn.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
