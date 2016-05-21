/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paths_;

import java.nio.file.Path;
import java.nio.file.Paths;

public class TestNormalize {

    public static void main(String[] args) {
        System.out.println("***************************");
        Path path = Paths.get("/tmp/anotherDirectory",
                "..", "..", "nueva");
        System.out.println(path);
        System.out.println(path.normalize());
        System.out.println(Paths.get("/a/./b/./c").normalize());
        System.out.println(Paths.get(".class").normalize());
        System.out.println(Paths.get("/a/b/c/..").normalize());
        System.out.println(Paths.get("hola/../a/b/c").normalize());
        
    }

}
