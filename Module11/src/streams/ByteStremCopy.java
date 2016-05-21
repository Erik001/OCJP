package streams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStremCopy {

	public static void main(String[] args) {
		byte[] b = new byte[128];
		int bLen = b.length;
		File file = new File("2016-03-19 18_16_25-Resultado.png");
		File newFile = new File("copy_2016-03-19 18_16_25-Resultado.png");
		try (FileInputStream fis = new FileInputStream(file); FileOutputStream fos = new FileOutputStream(newFile)) {

			int read;
			while ((read = fis.read(b)) != -1) {
				if (read < bLen)
					fos.write(b, 0, read);
				else
					fos.write(b);
				System.out.println("Available Bytes: " + fis.available());
			}

		} catch (IOException io) {
			io.printStackTrace();
		}
	}

}
