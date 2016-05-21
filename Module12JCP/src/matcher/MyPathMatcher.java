/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matcher;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;


public class MyPathMatcher extends SimpleFileVisitor<Path> {
	private final PathMatcher MATCHER;
	
	public MyPathMatcher(){
		//MATCHER = FileSystems.getDefault().getPathMatcher("glob:**html");//** navega por subdirectorios	
		MATCHER = FileSystems.getDefault().getPathMatcher("glob:*html");
	}
	
	void find(Path file){
		Path name = file.getFileName();
		//Path name = file;
		if(MATCHER.matches(name)){
			System.out.println(name);
		}
	}
	
	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes atr) throws IOException{
		find(file);
		return FileVisitResult.CONTINUE;
	}

	public static void main(String...args) throws IOException{
		MyPathMatcher obj = new MyPathMatcher();
		Files.walkFileTree(Paths.get("home/foo/"), obj);
	}
}
