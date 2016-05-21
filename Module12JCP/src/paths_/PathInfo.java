package paths_;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathInfo {

	public static void main(String[] args) {
		Path aFilePath = Paths.get("C:\\JavaOCJP\\jarDir\\TestJava.java");
		while(aFilePath.iterator().hasNext()){
			System.out.println(aFilePath);
			System.out.println("path elements: " + aFilePath.iterator().next());
		}

	}

}
