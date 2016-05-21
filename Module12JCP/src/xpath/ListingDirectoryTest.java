/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xpath;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class ListingDirectoryTest {
	public static void main(String[] args) {
		Path dir = Paths.get("home/foo/bar");
		try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir, "*.java"))
		// "*.{java,html}"))
		{// *.{java,html,jar} **.{java,html,jar} *.java,html,jar [in|My]*
			for (Path entry : stream) {
				System.out.println(entry.getFileName());
			}
		} catch (IOException e) {
			System.out.println("Caught IOExcption");
		}
		System.out.println("****************************");
		Path p1 = Paths.get("/com/java/One.java");
		PathMatcher matcher = FileSystems.getDefault().getPathMatcher(
				"glob:**.java");
				// "glob:*.java");
		System.out.println(matcher.matches(p1));
	}
}
