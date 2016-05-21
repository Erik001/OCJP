/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package files_;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardOpenOption.*;

/**
 *
 * @author JRobles
 */
public class ReadWriteTest {
	public static void main(String args[]) {
		String path = "C:/Users/torrer02/Documents/workspace-sts-3.7.2.RELEASE/Module12JCP/";
		Path path1 = Paths.get(path, "file.txt");
		try (InputStream ins = Files.newInputStream(path1);
				BufferedReader reader = new BufferedReader(new InputStreamReader(ins));
				OutputStream out = new  BufferedOutputStream(Files.newOutputStream(path1,CREATE,APPEND ))) {
					String string = "nine\r\nten\r\neleven\r\n";
					byte[] data = string.getBytes();
					out.write(data,0,data.length);									

		} catch (IOException io) {

		}
	}
}
