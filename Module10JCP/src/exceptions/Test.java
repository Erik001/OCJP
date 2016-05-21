package exceptions;

import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		try(One one = new One(); Two two = new Two()){
			//throw new Exception("try");
		}catch(Exception io){
			System.out.println("Main:::" + io.getMessage());
			Throwable[] exc = io.getSuppressed();
			for(Throwable ex: exc){
				System.out.println(ex.getMessage());
			}
		}finally{
			System.out.println("finally");
		}

	}

}
