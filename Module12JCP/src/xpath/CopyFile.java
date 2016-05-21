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

/**
 *
 * @author JRobles
 * creamos una carpeta en /tmp/test1
 */

public class CopyFile {
    public static void main(String[] args) throws IOException{
    	Path source = Paths.get("c:/","Users","torrer02", "Documents", "Portabilidad.txt");
    	Path target = Paths.get("/Users//torrer02/Portabilidad.txt");
    	//Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
    	//Files.delete(target);
    	Files.move(source, target, StandardCopyOption.REPLACE_EXISTING);
    }     
}
