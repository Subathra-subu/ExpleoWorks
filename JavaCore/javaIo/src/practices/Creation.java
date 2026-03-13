package practices;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Creation{

	public static void main(String[] args) {
		
		try {
			
			Path p = Paths.get("D:\\Workouts\\src\\string\\Panagram.txt");
			
			if(!Files.exists(p)) {
				Files.createFile(p);
				System.out.print("File is Created.");
			}
			
			else {
				System.out.print("File is already exists.");
			}
			
			
		}
		catch(IOException e) {
			System.out.print(e);
		}

	}

}
