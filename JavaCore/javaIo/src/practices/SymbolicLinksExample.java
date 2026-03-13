package practices;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SymbolicLinksExample {

	public static void main(String[] args) {
		
		Path existingPath = Paths.get("D:\\Workouts\\src\\string\\Panagram.java");
		Path symbolicPath = Paths.get("D:\\Workouts");
		
		try {
			Files.createSymbolicLink(existingPath, symbolicPath);
		}
		catch(IOException x) {
			System.err.print(x);
		}
		catch (UnsupportedOperationException e) {
			System.err.print(e);
		}
	}

}
