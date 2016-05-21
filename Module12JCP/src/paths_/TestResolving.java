/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paths_;

import java.nio.file.Path;
import java.nio.file.Paths;

public class TestResolving {
	public static void main(String[] args) {
		Path dir = Paths.get("/home/java");
		Path dir2 = Paths.get("/raiz/subcarpeta");
		Path file = Paths.get("models/Model.pdf");
		Path result = dir.resolve(file);
		System.out.println(result);
		Path absolute = Paths.get("/home/java");
		Path relative = Paths.get("dir");
		Path file2 = Paths.get("Model.pdf");
		System.out.println("**********************************");
		System.out.println("1: " + absolute.resolve(relative));
		System.out.println("2: " + absolute.resolve(file2));
		System.out.println("3: " + relative.resolve(file2));
		System.out.println("4: " + relative.resolve(absolute));
		System.out.println("5: " + file2.resolve(absolute));
		// System.out.println("5: " + file2.resolve((String)null));
		System.out.println("6: " + file2.resolve(relative));
		System.out.println("7: " + absolute.resolve(dir2));
		System.out.println("**********************************");
		Path path2 = Paths.get("I:\\Juan Robles\\d\\java 7 y maquina virtual\\upgrade\\proyectos\\NIO\\prueba.txt");
		if (path2.endsWith("prueba.txt"))
			System.out.println("true");
		else
			System.out.println("false");
		Path path3 = Paths.get("I:\\Juan Robles\\d\\java 7 y maquina virtual\\upgrade\\proyectos\\NIO\\prueba.txt");
		if (path2.equals(path3))
			System.out.println("true");
		else
			System.out.println("false");

		// new TestResolving().sumar(1,2,3,4); BAD ambiguous

	}

	public void sumar(int x, int... y) {

	}

	public void sumar(int... x) {

	}
}
