/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xpath;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author JRobles
 */
public class PathTest {

    public static void main(String[] args) {
        //Path: Example
        Path p1 = Paths.get("home");
        Path p2 = Paths.get("home", "foo", "bar", "MyClass.java");
        for (Path p4 : p2) {
            System.out.println(p4);
        }
        FileSystem fs = FileSystems.getDefault();
        Path path = fs.getPath("D:\\labs\\resources\\.\\module11\\..\\myFile.txt");

        System.out.format("getFileName: %s%n", path.getFileName());
        System.out.format("getParent: %s%n", path.getParent());
        System.out.format("getNameCount: %d%n", path.getNameCount());
        System.out.format("getRoot: %s%n", path.getRoot());
        System.out.format("isAbsolute: %b%n", path.isAbsolute());
        System.out.format("toAbsolutePath: %s%n", path.toAbsolutePath());
        System.out.format("toURI: %s%n", path.toUri());

        //Removing Redundancies from a Path
        path = path.normalize();
        System.out.println(path);

        //Creating a Subpath
        System.out.printf("getName(0): %s \n", path.getName(0));
        System.out.printf("subpath(0,2): %s \n", path.subpath(0, 2));

        //Joining Two Paths
        Path absolute = Paths.get("/home/java");
        Path relative = Paths.get("dir");
        Path file = Paths.get("Model.pdf");
        System.out.println("1: " + absolute.resolve(relative));
        System.out.println("2: " + absolute.resolve(file));
        System.out.println("3: " + relative.resolve(file));
        System.out.println("4: " + relative.resolve(absolute)); // BAD
        System.out.println("5: " + file.resolve(absolute)); // BAD
        System.out.println("6: " + file.resolve(relative)); // BAD
        
        //Creating a Path Between Two Paths
        Path path2 = fs.getPath("D:\\labs\\resources\\module11\\myFile.txt");
        System.out.println(path.relativize(path2));

        if (path2.endsWith("myFile.txt")) {//*.txt txt module11\\myFile.txt
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        Path path3 = fs.getPath("D:\\labs\\resources\\module11\\myFile.txt");
        if (path3.equals(path2)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
