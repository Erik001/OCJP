/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xpath;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/*para mover un archivo o un directorio lo indicamos mediante el path
y le indicamos donde lo vamos a colocar

en caso de no exitir envia un NoSuchFileException
*/
public class MoveTest {

    public static void main(String[] args) throws IOException {
        Path p1 = Paths.get("home/foo/bar/myOracle.html");
        Path p2 = Paths.get("home/foo2"); // si ya exiete nos manda una excepcion
        Files.move(p1, p2, StandardCopyOption.ATOMIC_MOVE);
    }
}
