/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFileAttributesTest {
    public static void main(String[] args) throws IOException{
    	Path path = Paths.get("C:\\Users\\torrer02\\Downloads\\blocking_process_query.txt");
    	BasicFileAttributes basic = Files.readAttributes(path, BasicFileAttributes.class);
    	System.out.println("creationTime: " + basic.creationTime());
    	System.out.println("lastModifiedTime: " + basic.lastModifiedTime());
    	System.out.println("lastAccessTime: " + basic.lastAccessTime());
    	System.out.println("isDirectory: " + basic.isDirectory());
    	
    	System.out.println("********************************************");
    	FileTime lastUpdate = basic.lastAccessTime();
    	FileTime create = basic.creationTime();
    	FileTime now = FileTime.fromMillis(System.currentTimeMillis());
    	
    	BasicFileAttributeView basicView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
    	basicView.setTimes(now, now, now);
    	
    	basic = Files.readAttributes(path, BasicFileAttributes.class);
    	System.out.println("creationTime: " + basic.creationTime());
    	System.out.println("lastModifiedTime: " + basic.lastModifiedTime());
    	System.out.println("lastAccessTime: " + basic.lastAccessTime());
    	System.out.println("isDirectory: " + basic.isDirectory());
    }
}

