package streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ByteChannelCopy {

	public static void main(String[] args) {
		try(FileChannel fcIn = new FileInputStream("file.txt").getChannel();
				FileChannel fcOut = new FileOutputStream("file_copy2.txt").getChannel()){
			ByteBuffer buff = ByteBuffer.allocate((int)fcIn.size());
			fcIn.read(buff);
			buff.position(10);//El salto de linea equivale a dos caracteres -- nueva linea y regreso de carro
			fcOut.write(buff);
			
		}catch(IOException io){
			io.printStackTrace();
		}

	}

}
