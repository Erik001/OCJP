/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package files_;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestFile {
    public static void main(String[] args) {
        File file = new File("Dir");
        file.mkdir();
        File file2 = new File(file,"archivo.txt");
        
        try {
            File f = new File("Dir2");
            file2.createNewFile();
            file.renameTo(f);
        } catch (IOException ex) {
            Logger.getLogger(TestFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
