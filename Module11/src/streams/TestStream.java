package streams;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class TestStream {

	public static void main1(String[] args) throws IOException {
		OutputStream fos = new FileOutputStream("c:\\Libraries\\dat.bin");
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeByte(0);
		dos.close();
	}
	
	public static void main2(String[] args) throws IOException {
		OutputStream fos = new FileOutputStream(new File("c:\\Libraries\\dat.bin"));
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeByte(0);
		dos.close();
	}
	
	public static void main3(String[] args) throws IOException {
		OutputStream fos = new FileOutputStream(new File("c:\\Libraries\\dat.bin"));
		OutputStream bos = new BufferedOutputStream(fos);
		DataOutputStream dos = new DataOutputStream(bos);
		dos.writeByte(343434);
		dos.close();
	}
	
	public static void main(String[] args) throws IOException {
		OutputStream fos = new FileOutputStream("c:\\Libraries\\dat.bin");
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeByte(21432432);
		dos.close();
	}
	
	public static void testInputStream() throws FileNotFoundException{
		FileInputStream findings = new FileInputStream("log.txt");
		DataInputStream dataStram = new DataInputStream(findings);
		BufferedReader br = new BufferedReader(new InputStreamReader(dataStram));
		String line;
		try {
			while((line = br.readLine()) != null){
				System.out.println(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
