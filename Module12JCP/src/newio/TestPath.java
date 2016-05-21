package newio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestPath {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("fileWriter.txt");
		System.out.println(Files.exists(path));
		Path path1 = Paths.get("/java7/source");
		System.out.println(Files.exists(path1));
		Path path2 = Paths.get("/java7/source/directory");
		System.out.println(Files.exists(path2));
		Path path3 = Paths.get("/java7/source/directory/programa.java");
		System.out.println(Files.exists(path3));
		// Files.createDirectory(path1);
		Files.createDirectories(path2);
		if (!Files.exists(path3))
			Files.createFile(path3);
	}

}
