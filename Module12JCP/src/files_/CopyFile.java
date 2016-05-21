/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package files_;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JRobles
 */
public class CopyFile {
    public static void main(String[] args) {
        Path source = Paths.get("home/foo/bar/file2.txt");
        Path target = Paths.get("home/foo/file2.txt");
        Path target2 = Paths.get("home/archivo.txt");
        try {
            Files.copy(source, target,StandardCopyOption.REPLACE_EXISTING);
            Files.move(target, target2, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException ex) {
            Logger.getLogger(CopyFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
