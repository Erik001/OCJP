package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.NoSuchFileException;

public class FileCopier {

	public static void copy(String records1, String records2){
		try(
			InputStream is = new FileInputStream(records1);
			OutputStream os = new FileOutputStream(records2);){
			if(os == null){
				//os = new FileOutputStream("c:\\default.txt"); //BAD the resource in a try with resources statement cannot be assigned
			}
			byte[] buffer = new byte[1024];
			int bytesRead = 0;
			while((bytesRead = is.read(buffer)) != -1){
				os.write(buffer,0,bytesRead);
				System.out.println("Rwad and written bytes " + bytesRead);
			}
		}catch(IOException | RuntimeException e){
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		copy("c:\\temp\\test.txt","c:\\temp\\test2.txt");

	}

}
