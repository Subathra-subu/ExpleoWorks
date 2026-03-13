package practices;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.Instant;

public class FileMethods {

	public static void main(String[] args) throws IOException {
		
		Path p = Paths.get("D:\\Workouts\\Subathra.txt");
		
		System.out.print("Size of the file: "+Files.size(p));
		
		System.out.print("\nIs Directory: "+Files.isDirectory(p));
		
		System.out.print("\nIs Regular file: "+Files.isRegularFile(p));
		
		System.out.print("\nIs Symbolic Link: "+Files.isSymbolicLink(p));
		
		System.out.print("\nIs Hidden: "+Files.isHidden(p));
		
		System.out.print("\nGet LastModified Time: "+Files.getLastModifiedTime(p));
		
		FileTime newTime = FileTime.from(Instant.now());  
		
		Files.setLastModifiedTime(p,newTime);
		
		System.out.print("\nAfter Set the LastModified Time: "+Files.getLastModifiedTime(p));
		
		System.out.print("\nIs Readable: "+Files.isReadable(p));
		
		System.out.print("\nIs Writeable: "+Files.isWritable(p));
		
		System.out.print("\nIs Executable: "+Files.isExecutable(p));

	}

}
