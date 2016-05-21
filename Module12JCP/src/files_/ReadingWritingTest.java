/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package files_;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardOpenOption.*;
import java.util.List;

/**
 *
 * @author JRobles
 */
public class ReadingWritingTest {

	public static void main(String[] args) throws IOException {
		Path source = Paths.get("home/foo/bar/TextFile.txt");
		Path file = Paths.get("home/foo/bar/TextFileCopy.txt");
		List<String> lines;
		Charset cs = Charset.defaultCharset(); // default de la maquina virtual
		lines = Files.readAllLines(source, cs);

		Files.write(file, lines, cs);

	}
}
