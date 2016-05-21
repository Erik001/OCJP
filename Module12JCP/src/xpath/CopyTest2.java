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
 */
public class CopyTest2 {
    public static void main(String[] args)throws IOException{
        Path one = Paths.get("/temp/test1.txt");
        Path two = Paths.get("/temp/test2/tmp333");
        Path targ = Paths.get("/tmp/test2.txt");
        Files.move(one, targ,StandardCopyOption.REPLACE_EXISTING);
        //Files.copy(two, targ,StandardCopyOption.REPLACE_EXISTING);
    }
}

