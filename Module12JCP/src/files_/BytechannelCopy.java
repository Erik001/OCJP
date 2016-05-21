/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package files_;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;

public class BytechannelCopy {

    public static void main(String[] args) {
        try (SeekableByteChannel fcIn = new FileInputStream("file.txt").getChannel();
                FileChannel fcOut = new FileOutputStream("filecopy2.txt").getChannel()) {

            ByteBuffer buff = ByteBuffer.allocate((int) fcIn.size());
            fcIn.read(buff);
            System.out.println(buff.position()); // posicion del buffer
            buff.position(10); // lo pocicona en el numero 10
            System.out.println(buff.position());//numero de posiocion en el buffer
            fcOut.write(buff); // escribe los bytes
            fcOut.truncate(10); //despues de 10 carcteres no guarda nada
        } catch (IOException io) {
            io.printStackTrace();
        }
    }

}
