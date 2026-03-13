package practices;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Deletion {

	public static void main(String[] args) {
	
		Path p = Paths.get("D:\\Workouts\\Subathra.java");
		
		try {
			Files.deleteIfExists(p);
		}
		catch (NoSuchFileException e) {
			System.out.print("File not found");
		}
		
		catch(IOException e) {
			System.out.print("Invalid Permissions");
		}
		
		System.out.print("Directory deleted successfully");

	}

}
