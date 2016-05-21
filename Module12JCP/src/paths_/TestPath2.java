/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paths_;

import java.nio.file.Path;
import java.nio.file.Paths;

public class TestPath2 {
    public static void main(String[] args) {
        Path path = Paths.get("C:/home","java","workspace");
       
        System.out.println(path.toString());
        System.out.println("getFile : "+ path.getFileName());
        System.out.println("getName(1): " + path.getName(1));
        System.out.println("path.getNameCount():"+ path.getNameCount());
        System.out.println("path.getParent():" + path.getParent());
        System.out.println("path.getRoot(): "+ path.getRoot());
        System.out.println("path.subpath(0, 2):"+path.subpath(0, 2));
        int space=1;
        System.out.println("-----------foreach-------------");
        //%[indice$][banderas][ancho][.presicion]caracter de conversion
        for (Path auxPath : path) {
            System.out.printf("%"+space+"s%s%n","",auxPath);
            space+=2;
        }
        
    }
}
