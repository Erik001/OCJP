package paths_;

import java.nio.file.Path;
import java.nio.file.Paths;

public class SubPath {

	public static void main(String[] args) {
		Path aPath = Paths.get("D:\\OCPJP7\\programs\\..\\NIO2\\src\\.\\SubPath.java");
		aPath = aPath.normalize();
		System.out.println(aPath);
		System.out.println(aPath.subpath(2, 3));

	}

}
