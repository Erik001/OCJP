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

public class Finder extends SimpleFileVisitor<Path> {
	
	private final PathMatcher matcher;
	private static int numMatches;
	
	public Finder(){
		matcher = FileSystems.getDefault().getPathMatcher("glob:*java");
	}
	
	void find(Path file){
		Path name = file.getFileName();
		if(name != null && matcher.matches(name)){
			numMatches++;
		}
	}
	
	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes bfa) throws IOException{
		find(file);
		return FileVisitResult.CONTINUE;
	}

	public static void main(String[] args) throws IOException {
		Finder finder = new Finder();
		Files.walkFileTree(Paths.get("src"), finder);
		finder.report();

	}

	void report() {
		System.out.println("Matcher: " + numMatches);
		
	}

}
