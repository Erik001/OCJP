package files_;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Relativize {

	public static void main(String[] args) {
		Path javaPath = Paths.get("C:\\JavaOCJP\\jarDir\\a\\TestJava.java").normalize();
		System.out.println(javaPath);
		Path classPath = Paths.get("C:\\JavaOCJP\\jarDir\\a\\TestJava.class").normalize();
		System.out.println(classPath);
		Path result = javaPath.relativize(classPath);
		if(result == null){
			System.out.println("relativize failed");
		}else if(result.equals(Paths.get(""))){
			System.out.println("relative paths are same, so relativize returned empty path");
		}else{
			System.out.println(result);
		}
		
		String source = "C:\\JavaOCJP\\jarDir\\a\\TestJava.java";
		String dest = "C:\\JavaOCJP\\jarDir\\TestJava.java";
		
		/*try(BufferedReader br = Files.newBufferedReader(Paths.get(source),Charset.forName("UTF-8"));
				BufferedWriter bw = Files.newBufferedWriter(Paths.get(dest), Charset.forName("UTF-8"))){
			String record;
			while((record = br.readLine())!= null){
				bw.write(record);
				bw.newLine();
			}
			Files.delete(Paths.get(source));
			*/
		/*try{
			Files.copy(Paths.get(source), Paths.get(dest), StandardCopyOption.REPLACE_EXISTING);
			Files.delete(Paths.get(source));*/
		try{
			//Files.move(Paths.get(source), Paths.get(dest), StandardCopyOption.REPLACE_EXISTING, LinkOption.NOFOLLOW_LINKS);
			Files.move(Paths.get(source), Paths.get(dest), StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.ATOMIC_MOVE);
		}catch(IOException io){
			io.printStackTrace();
		}

	}

}
