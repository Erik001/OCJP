package exceptions;

import java.io.Closeable;
import java.io.IOException;

public class One implements Closeable {

	@Override
	public void close() throws IOException {
		System.out.println("One");
		throw new IOException("One Exception");
		
	}

}

class Two implements AutoCloseable {


	public static void main(String[] args) {
		

	}

	@Override
	public void close() throws IOException {
		System.out.println("Two");
		throw new IOException("Two Exception");
		
	}

}
