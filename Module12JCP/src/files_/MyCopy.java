package files_;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class MyCopy {

	public static boolean isContentSame() throws IOException{
		Path p1 = Paths.get("C:\\JavaOCJP\\jarDir\\TestJava.java");
		Path p2 = Paths.get("C:\\JavaOCJP\\jarDir\\a\\TestJava.java");
		Files.copy(p1, p2,StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.COPY_ATTRIBUTES
				, LinkOption.NOFOLLOW_LINKS);
		if(Files.isSameFile(p1, p2)){
			return true;
		}else{
			return false;
		}
	}
	public static void main(String[] args) {
		try{
			boolean flag = isContentSame();
			if(flag){
				System.out.println("Equal");
			}else{
				System.out.println("Not equal");
			}
		}catch(Exception e){
			System.err.println("Caught IOException: " + e.getMessage());
		}

	}

}
