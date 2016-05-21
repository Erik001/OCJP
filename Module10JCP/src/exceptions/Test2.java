package exceptions;

import java.io.IOException;

public class Test2 {
	
	public static void testException() throws IOException{
		try {
			throw new IOException("IOException.....!!!!");
		} catch (Exception e) {
			throw e;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
