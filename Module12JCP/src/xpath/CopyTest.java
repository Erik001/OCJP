/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xpath;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 *
 * @author JRobles
 */
public class CopyTest {

    public static boolean isContentSame() throws IOException {
        //Copying a File or Directory
        Path p1 = Paths.get("home/foo/bar/index.html");
        Path p2 = Paths.get("home/foo/index.html");

        Files.copy(p1, p2, StandardCopyOption.REPLACE_EXISTING, 
                StandardCopyOption.COPY_ATTRIBUTES);
        return Files.isSameFile(p1, p2);
    }

    public static void main(String[] args) {
        try {
            boolean flag = isContentSame();
            if (flag) {
                System.out.println("Equal");
            } else {
                System.out.println("Not equal");
            }
        } catch (Exception e) {
            System.err.println("Caught IOException: " + e.getMessage());
        }
    }
}
