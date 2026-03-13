package practices;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Pathmethods {

	public static void main(String[] args) {
		
		Path p1 = Paths.get("D:\\Personal\\Example\\test.txt");

		Path p2 = p1.normalize();
		
		Path p3 = Paths.get("D:\\Workouts\\src\\string\\Panagram.java");

		System.out.println("Normalized Path:"+p2);
		
		System.out.println("Root: "+p1.getRoot());
		
		System.out.println("Parent: "+p1.getParent());
		
		System.out.println("Count: "+p1.getNameCount());
		
		System.out.println("File name: "+p1.getFileName());
		
		System.out.println("isAbsolute: "+p1.isAbsolute());
		
		System.out.println("toAbsolutePath: "+p1.toAbsolutePath());
		
		System.out.println("toURI: "+p1.toUri());
		
		boolean result = Files.exists(p3);
		
		System.out.println("P3 isExists:"+result);
		
		if(p1.equals(p3)) {
			System.out.println("Both are equal");
		}
		else System.out.println("Both are not equal");
	}

}
