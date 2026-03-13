package practices;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyOperation {

	public static void main(String[] args) {
		
		Path sourcePath = Paths.get("D:\\Workouts\\Subathra.txt");
		Path targetPath = Paths.get("D:\\Workouts\\src\\string\\Panagram.txt");
		
		try {
			System.out.println(sourcePath+" "+ "Copied to:"+ targetPath +" "+ Files.copy(sourcePath, 
					targetPath,StandardCopyOption.REPLACE_EXISTING));
		}
		catch(IOException e) {
			System.out.print(e);
		}
	}

}
