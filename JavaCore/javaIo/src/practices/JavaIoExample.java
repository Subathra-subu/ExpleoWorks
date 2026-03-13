package practices;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
//import java.nio.file.Paths;

public class JavaIoExample {

	public static void main(String[] args) {
	
		FileSystem fSystem = FileSystems.getDefault();
		Path p1 = fSystem.getPath("D:\\Personal\\Training\\Example\\test.txt");
		
//		Path p1 = Paths.get("D:\\Personal\\Training\\Example\\test.txt");
		Path p2 = p1.subpath(1,3);
		System.out.println(p1);
		System.out.println(p2);

	}

}
