
package paths_;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestPath {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("fileWriter.txt");
        if(!Files.exists(path))
             Files.createFile(path);
        System.out.println(Files.exists(path));
        Path p1 = Paths.get("java/source");
        Path p2 = Paths.get("java/source/directory");
        Path file = Paths.get("java/source/directory/Programa.java");
        Files.createDirectory(p1);
        Files.createDirectory(p2);
        //Files.createDirectories(p2);
        Files.createFile(file);
        
        
    }
}
