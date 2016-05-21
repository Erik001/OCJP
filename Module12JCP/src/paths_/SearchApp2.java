package paths_;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class SearchApp2 extends SimpleFileVisitor<Path>{

	private final PathMatcher matcher;
	
	public SearchApp2(){
		matcher = FileSystems.getDefault().getPathMatcher("glob:*{.htm,html,xml}");
	}
	
	void search(Path file){
		Path name = file.getFileName();
		if(name != null && matcher.matches(name)){
			System.out.println(name);
		}
	}
	
	public FileVisitResult visitFile(Path file, BasicFileAttributes atr){
		search(file);
		return FileVisitResult.CONTINUE;
	}
	public static void main(String[] args) throws IOException {
		SearchApp2 searchApp2 = new SearchApp2();
		Files.walkFileTree(Paths.get("docs"), searchApp2);
	}

}
