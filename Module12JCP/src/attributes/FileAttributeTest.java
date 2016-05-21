
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributes;

/**
 *
 * @author JRobles
 */
public class FileAttributeTest {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("home/foo/bar/index.html");

        DosFileAttributes dos = Files.readAttributes(path,
                DosFileAttributes.class); // dos attributes
        System.out.println("Hidden: " + dos.isHidden());
        System.out.println("ReadOnly: " + dos.isReadOnly());

        Files.setAttribute(path, "dos:hidden", true);
        Files.setAttribute(path, "dos:readonly", true);
        dos = Files.readAttributes(path,
                DosFileAttributes.class); // get attributes again
        System.out.println("Hidden: " + dos.isHidden());
        System.out.println("ReadOnly: " + dos.isReadOnly());
    }
}
