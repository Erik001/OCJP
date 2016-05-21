package files_;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestDirectoryStream {

	public static void main(String[] args) {
		Path dir = Paths.get("C:\\JavaOCJP\\company");
		//try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir, "*.[java,html,jar]")) {
		//try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir, "**.{java,html,jar}")) {
		try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir, "*.{java*,html*,jar*}")) {
		//try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir, "*.{java,html,jar}")) {

			for (Path entry : stream) {
				System.out.println(entry);
				System.out.println(entry.getFileName());
			}
		} catch (IOException e) {
			System.out.println("Caught IOException");
		}

	}

}
