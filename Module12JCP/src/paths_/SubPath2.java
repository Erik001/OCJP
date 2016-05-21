package paths_;

import java.nio.file.Path;
import java.nio.file.Paths;

public class SubPath2 {

	public static void main(String[] args) {
		Path aPath = Paths.get("C:\\WINDOWS\\system32\\config"
				+ "\\systemprofile\\Start Menu\\Programs"
				+ "\\Accessories\\Entretainment\\Windows Media Player");
		
		System.out.println(aPath.subpath(3, 4));

	}

}
