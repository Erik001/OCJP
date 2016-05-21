package characters;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Base{
	public void process() throws IOException{
		FileReader fr = new FileReader("userguide.txt");
		BufferedReader br = new BufferedReader(fr);
		String record;
		while((record = br.readLine()) != null){
			System.out.println(record);
		}
				
	}
}

public class Derived extends Base{

	public void process() throws IOException{
		super.process();
		System.out.println("Success");
		
	}
	public static void main(String[] args) {
		try{
			new Derived().process();
		}catch(Exception e){
			System.out.println(e.getClass());
		}
		

	}

}
