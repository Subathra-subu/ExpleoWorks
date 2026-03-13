package practices;

import java.io.FileInputStream;

public class FileInput {

	public static void main(String[] args) {
		
		try {
			FileInputStream fileInputStream = new FileInputStream("Subathra.txt");
			
			System.out.println("Data in this File:");
			
			int i = fileInputStream.read();
			
			while(i!=-1) {
				System.out.print((char)i);
				i = fileInputStream.read();
			}
			
			fileInputStream.close();
			
		}
		catch (Exception e) {
			System.out.print(e);
		}
	}

}
