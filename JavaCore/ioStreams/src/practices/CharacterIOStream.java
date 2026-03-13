package practices;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;


public class CharacterIOStream {

	public static void main(String[] args) {
		
		char[] c = new char[128];
		
		try(FileReader fReader = new FileReader(args[0]);
				FileWriter fWriter = new FileWriter(args[1])){
			
			int count = 0,read = 0;
			while((read = fReader.read(c))!= -1) {
				fWriter.write(c);
				System.out.print(Arrays.toString(c));
				count+=read;
			}
			System.out.println("\nTotal count: "+count);
		}
		catch (Exception e) {
			System.out.println(e);
		}

	}

}
