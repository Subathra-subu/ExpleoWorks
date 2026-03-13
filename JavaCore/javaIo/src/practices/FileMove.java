package practices;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileMove {

	public static void main(String[] args) {
	
		Path sourcePath = Paths.get("D:\\Workouts\\src\\string\\Panagram.txt");
		Path targetPath = Paths.get("D:\\Workouts\\Subathra.txt");
		
		try {
			System.out.println(sourcePath+" "+ "moved to:"+ targetPath +" "+ Files.move(sourcePath, 
					targetPath,StandardCopyOption.REPLACE_EXISTING));
		}
		catch(IOException e) {
			System.out.print(e);
		}

	}

}
