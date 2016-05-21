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

public class PrintDirs extends SimpleFileVisitor<Path> {

    @Override
    /*antes de entar al directorio*/
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
        System.out.println("pre: " + dir);
        String name = dir.getFileName().toString();
        if (name.equals("reading")) {
            return FileVisitResult.SKIP_SUBTREE;
        }
        return FileVisitResult.CONTINUE;
    }

    @Override
    /*
    es llamado cuando encuentra archivos, pero no para los directorios
    */
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        System.out.println("file: " + file);
        if (file.getFileName().toString().equals("Test3.class")) {
            return FileVisitResult.SKIP_SIBLINGS;
        } else {
            return FileVisitResult.CONTINUE;
        }

    }

    @Override
    /*
    es llamado cuando hay un erro de acceso al archivo,
    usualmente por permisos
    */
    public FileVisitResult visitFileFailed(Path file, IOException exc) {
        return FileVisitResult.CONTINUE;
    }

    @Override
    /*
     * llamado cuando termina de con un directorio 
     */
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) {
        System.out.println("post: " + dir);
        return FileVisitResult.CONTINUE;
    }

    public static void main(String[] args) throws Exception {
        PrintDirs dirs = new PrintDirs();
        Files.walkFileTree(Paths.get("build"), dirs);
    }
}
