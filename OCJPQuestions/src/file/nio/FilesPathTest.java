package file.nio;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

public class FilesPathTest {
	// C:\\Libraries\\Hola\\abc.txt
	public static void main(String[] args) {
		try {
			new FilesPathTest().b();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void a() throws IOException {
		Path tempFile = Files.createTempFile("temp", ".java");
		System.out.println(tempFile.toString());
		System.out.println(tempFile.getFileName());
	}

	public void b() throws IOException {
		Path path = Paths.get("C:\\Libraries\\Hola\\test1.txt");
		Set<PosixFilePermission> perms = PosixFilePermissions.fromString("rw-rw-rw-");
		FileAttribute<Set<PosixFilePermission>> attr = PosixFilePermissions.asFileAttribute(perms);
		if (!Files.exists(path))
			Files.createFile(path, attr);
		if (Files.deleteIfExists(path)) {
			System.out.println("File deleted.....");
		}
	}
	
	public void c() throws IOException{
		Path path = Paths.get("C:\\Libraries\\Hola\\test1.txt");
		DirectoryStream ds = Files.newDirectoryStream(path);
	}

}
