
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package watch;

import static java.nio.file.StandardWatchEventKinds.ENTRY_CREATE;
import static java.nio.file.StandardWatchEventKinds.ENTRY_DELETE;
import static java.nio.file.StandardWatchEventKinds.ENTRY_MODIFY;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.nio.file.attribute.BasicFileAttributes;

public class WatchFileTest {

	public static void main(String[] args) throws IOException {
		Path dir = Paths.get("C:/Libraries/");
		final WatchService watcher = FileSystems.getDefault().newWatchService();
		dir.register(watcher, ENTRY_DELETE, ENTRY_CREATE, ENTRY_MODIFY);
		while (true) {
			WatchKey key;
			try {
				key = watcher.take();
			} catch (InterruptedException e) {
				return;
			}
			for (WatchEvent event : key.pollEvents()) {
				WatchEvent.Kind kind = event.kind();
				System.out.println(kind.name());
				System.out.println(event.context());
				// System.out.println(kind.name());
			}
			Files.walkFileTree(dir, new SimpleFileVisitor<Path>() {
				@Override
				public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes att) throws IOException {
					dir.register(watcher, ENTRY_DELETE, ENTRY_CREATE, ENTRY_MODIFY);
					return FileVisitResult.CONTINUE;
				}
			});
			key.reset();
		} // infinite loop
			// TODO Iterar por todos los elementos
		/*
		 * for(;;){ Infinite Loop }
		 */
	}

}
