/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xpath;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;

/**
 *
 * @author JRobles
 */
public class FileOperationsTest {
	public static void main(String[] args) throws IOException {
		// Checking a File or Directory
		File file = new File("home/foo/bar/file1.txt");
		if (!file.exists()) {
			file.createNewFile();
		} else {
			 file.delete();
		}
		Path path = Paths.get("home/foo/bar/file1.txt");
		if (Files.notExists(path)) {
			Files.createFile(path);
		} else {
			 Files.delete(path);
		}
		System.out.println("isReadable: " + Files.isReadable(path));
		System.out.println("isWritable: " + Files.isWritable(path));
		System.out.println("isExecutable: " + Files.isExecutable(path));
		System.out.println("isHidden: " + Files.isHidden(path));

		System.out.println("isSameFile: " + Files.isSameFile(path, file.toPath()));

		// Creating Files and Directories
		Path dir = Paths.get("java");
		Path dirs = Paths.get("java/bob");

		if (!Files.exists(dir))
			Files.createDirectory(dir);// Files.createDirectory(dirs);
		if (Files.notExists(dirs))
			Files.createDirectories(dirs);
	}
}
