package practices;

import java.io.FileOutputStream;


public class FileOutput {

	public static void main(String[] args) {
		
		String data = "Welcome to java portal!!!";
		
		try {
			
			FileOutputStream fileOutputStream = new FileOutputStream("D:\\Workouts\\Subathra.txt");
			byte[] array = data.getBytes();
			fileOutputStream.write(array);
			fileOutputStream.close();
		}
		catch(Exception e) {
			System.out.print(e);
		}
	}

}
