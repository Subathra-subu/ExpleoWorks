package practices;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputUsingByte {

	public static void main(String[] args) {
		
		byte[] bytes = new byte[128];
		
		try (FileInputStream fileInputStream = new FileInputStream("D:\\Workouts\\SubathraInput.txt");
				FileOutputStream fileOutputStream = new FileOutputStream("D:\\Expleo Training\\JavaCore\\Subathra.txt")){
			
			System.out.println("Bytes Available:"+fileInputStream.available());
			
			int count = 0,read = 0;
			while((read = fileInputStream.read(bytes))!= -1) {
				fileOutputStream.write(bytes);
				count+=read;
			}
			System.out.println("Total count: "+count);
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}
	

}
