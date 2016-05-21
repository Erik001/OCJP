/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paths_;

import java.nio.file.Path;
import java.nio.file.Paths;

public class TestRelativizing {
	public static void main(String[] args) {
		// como llegamos apartir de una una ruta dada
		Path dir = Paths.get("/home/java");
		Path music = Paths.get("/home/java/country/swift.mp3");
		Path mp3 = dir.relativize(music); // /country/swift.mp3
		System.out.println(mp3);
		mp3 = music.relativize(dir);
		System.out.println(mp3);
		System.out.println("****************************+");
		Path absolute1 = Paths.get("/home/java");
		Path absolute2 = Paths.get("/usr/java");
		Path absolute3 = Paths.get("/home/java/temp/music.mp3");
		Path relative1 = Paths.get("temp");
		//Path relative1 = Paths.get("tes"); Lo toma como si fueran los mismos
		Path relative2 = Paths.get("tes/temp/music");
		System.out.println("1: " + absolute1.relativize(absolute3));
		System.out.println("2: " + absolute3.relativize(absolute1));
		System.out.println("3: " + absolute1.relativize(absolute2));
		//System.out.println("4: " + absolute1.relativize(relative2));
		System.out.println("5: " + relative1.relativize(relative2));

	}

}
