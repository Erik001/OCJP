package matcher;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class MatcherTest {

	public static void main(String[] args) {
		PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:*???_*1?");
		String ar[] = { "Log-Jan_2009", "log_01_2010", "log_Feb2010", "log_Feb2011", "log_10.2012", "log_sum-2012" };
		for(String ar1 : ar){
			Path path = Paths.get(ar1);
			System.out.print(path + ": ");
			System.out.println(matcher.matches(path));
			
		}
	}

}
