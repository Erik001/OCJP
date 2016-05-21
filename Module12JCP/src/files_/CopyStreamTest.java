/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package files_;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 *
 * @author JRobles
 */
public class CopyStreamTest {
    public static void main (String[] args){
    	Path path = Paths.get("home/foo/bar/myOracle.html");
    	URI u = URI.create("http://www.oracle.com");
    	try(InputStream in = u.toURL().openStream()){
    		Files.copy(in, path, StandardCopyOption.REPLACE_EXISTING);
    	}catch(IOException io){
    		
    	}
    }
}
