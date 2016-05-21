package streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyBoardImput {

	public static void main(String[] args) {
		try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in));){
			String s = "";
			while(s != null){
				System.out.println("escribe exit para salir");
				s = in.readLine();
				System.out.println("Read: " + s);
				if(s.equals("exit")){
					System.exit(0);
				}
			}
		}catch(IOException io){
			io.printStackTrace();
		}

	}

}
