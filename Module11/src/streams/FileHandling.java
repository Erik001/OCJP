package streams;

import java.io.File;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) {
		File directory = new File("dir");
		directory.mkdir();
		System.out.println("getAbsolutePath : " + directory.getAbsolutePath() );
		File file = new File(directory, "file.txt");
		System.out.println("exists: " + file.exists());
		System.out.println("isFile: " + file.isFile());
		System.out.println("isDirectory: " + file.isDirectory());
		String path = "C:\\Users\\torrer02\\Documents\\workspace-sts-3.7.2.RELEASE\\Module11";
		File dirs = new File(path);
		System.out.println("************************************************");
		String[] listDir = dirs.list();
		/*for(String aux: listDir){
			File tmp = new File(path+File.separator+aux);
			tmp.delete();
			System.out.println(aux);
		}*/
		System.out.println("************************************************");
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
