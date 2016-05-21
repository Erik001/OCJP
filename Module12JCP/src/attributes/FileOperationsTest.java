package attributes;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JRobles
 */
public class FileOperationsTest {
    public static void main(String[] args) throws IOException {
        File file = new File("home/foo/bar/file1.txt");
        if(!file.exists())
            file.createNewFile();
        else{
            file.delete();
        }
        Path path = Paths.get("home/foo/bar/file2.txt");
        if(Files.notExists(path)){
            Files.createFile(path);
        }
        System.out.println(Files.isReadable(path));
        System.out.println(Files.isWritable(path));
        System.out.println(Files.isExecutable(path));
        System.out.println(Files.isHidden(path));
        
    }
}
