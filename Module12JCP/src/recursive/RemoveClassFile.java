/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursive;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class RemoveClassFile extends SimpleFileVisitor<Path>{
     @Override
     public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)
             throws IOException{
         System.out.println(file);
         //System.out.println(file.getFileName().toString().endsWith("class"));
        if(file.getFileName().toString().endsWith("class")){
            Files.delete(file);   
        }
        return FileVisitResult.CONTINUE;
    }
    public static void main(String[] args) throws IOException{
        RemoveClassFile dirs = new RemoveClassFile();
        Files.walkFileTree(Paths.get("build"), dirs);
    }
}
